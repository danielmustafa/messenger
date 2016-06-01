package org.koushik.javabrains.messenger.service;

import java.util.*;

import org.bson.types.ObjectId;
import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Message;

public class MessageService {

    private DatabaseClass dc = new DatabaseClass("messenger",Message.class);
	//private Datastore messagesDataStore = dc.getDatastore("messenger");
	//private final Query<Message> msgQuery = messagesDataStore.createQuery(Message.class);

	public MessageService() {
	}

	public List<Message> getAllMessages() {
		//final List<Message> msgList = (List<Message>) dc.getAll();
		//final List<Message> messageList = msgQuery.asList();
		return (List<Message>) dc.getAll();

	}
	
	public Message getMessage(ObjectId id) {

		//return msgQuery.field("id").equal(id).get();
		return (Message) dc.getById(id);

	}
	
	public Message addMessage(Message message) {
		message.setId(new ObjectId().toString());

		if (message.getCreated() == null){
			message.setCreated(new Date());
		}

		//messages.put(message.getId(), message);
        //messagesDataStore.save(message);
		dc.insert(message);
		return message;
	}
	
	public boolean updateMessage(Message message) {
		if (message.getId() == null) {
			return false;
		}

		return dc.updateById(message.getId(),Message.class,"message",message.getMessage());
	}
	
	public void removeMessage(String id) {

		dc.removeById(id,Message.class);

	}
	

	
	
	
}
