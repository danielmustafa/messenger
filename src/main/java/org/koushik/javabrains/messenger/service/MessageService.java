package org.koushik.javabrains.messenger.service;

import java.util.*;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Message;

public class MessageService {

    private DatabaseClass dc = new DatabaseClass();
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	private MongoCollection<Document> messageCollection;
	
	public MessageService() {
        try {
            messageCollection = dc.getMongoCollection("messenger", "messages");
        }
        finally{

        }
		/*messages.put(1L, new Message(1, "Hello World", "daniel"));
		messages.put(2L, new Message(2, "Hello Jersey", "daniel2"));*/
		//messageCollection.insertOne(new Message(1,"Hello World","Daniel").toDoc());


	}
	
	
	public List<String> getAllMessages() {
		//return new ArrayList<Message>(messages.values());
        List<String> messageList = new ArrayList<>();
        MongoCursor<Document> cursor = messageCollection.find().iterator();

        try{
            while(cursor.hasNext()){
                messageList.add(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }

        return messageList;
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);

		if (message.getCreated() == null){
			message.setCreated(new Date());
		}

		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	

	
	
	
}
