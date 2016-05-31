package org.koushik.javabrains.messenger.service;

import java.util.*;

import org.bson.types.ObjectId;
import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Message;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

public class MessageService {

    private DatabaseClass dc = new DatabaseClass("messenger",Message.class);
	private Datastore messagesDataStore = dc.getDatastore("messenger");
	private final Query<Message> msgQuery = messagesDataStore.createQuery(Message.class);

	public MessageService() {
	}

	public List<Message> getAllMessages() {
		final List<Message> msgList = (List<Message>) dc.getAll();
		//final List<Message> messageList = msgQuery.asList();
		return msgList;

	}
	
	public Message getMessage(ObjectId id) {

		return msgQuery.field("id").equal(id).get();


	}
	
	public Message addMessage(Message message) {
		message.setId(new ObjectId().toString());

		if (message.getCreated() == null){
			message.setCreated(new Date());
		}

		//messages.put(message.getId(), message);
        messagesDataStore.save(message);

		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() == null) {
			return null;
		}



		return message;
	}
	
	public void removeMessage(ObjectId id) {

	}
	

	
	
	
}
