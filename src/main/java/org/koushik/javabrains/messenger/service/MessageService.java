package org.koushik.javabrains.messenger.service;

import java.util.*;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Message;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

public class MessageService {

    private DatabaseClass dc = new DatabaseClass();
	private Map<ObjectId, Message> messages = DatabaseClass.getMessages();
	private MongoCollection<Document> messageCollection;
	private Datastore messagesDataStore = dc.getDatastore("messenger");
	public MessageService() {

		/*messages.put(1L, new Message(1, "Hello World", "daniel"));
		messages.put(2L, new Message(2, "Hello Jersey", "daniel2"));*/
		//messageCollection.insertOne(new Message(1,"Hello World","Daniel").toDoc());


	}
	


	public List<Message> getAllMessages() {
		final Query<Message> msgQuery = messagesDataStore.createQuery(Message.class);
		final List<Message> messageList = msgQuery.asList();

		return messageList;

		//return new ArrayList<Message>(messages.values());
/*        List<Message> messageList = new ArrayList<>();
        MongoCursor<Document> cursor = messageCollection.find().iterator();

        try{
            while(cursor.hasNext()){
                //messageList.add(cursor.next());
            }
        } finally {
            cursor.close();
        }

        return messageList;*/
	}
	
	public Message getMessage(ObjectId id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(new ObjectId());

		if (message.getCreated() == null){
			message.setCreated(new Date());
		}

		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() == null) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(ObjectId id) {
		return messages.remove(id);
	}
	

	
	
	
}
