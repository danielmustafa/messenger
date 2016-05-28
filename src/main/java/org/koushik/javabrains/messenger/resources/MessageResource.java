package org.koushik.javabrains.messenger.resources;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.bson.Document;
import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();

/*	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}*/

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		List<Message> list = new ArrayList<>();
		Message m1 = new Message(1L,"daniel","test");
		Message m2 = new Message(2L,"daniel2","test2");
		list.add(m1);
		list.add(m2);
		return list;

		//return messageService.getAllMessages();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){

		messageService.addMessage(message);

		return message;
	}

	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") Long id){
		messageService.removeMessage(id);

	}

	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") Long id, Message message){
		message.setId(id);
		messageService.updateMessage(message);

		return message;

	}

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") Long id) {
		return messageService.getMessage(id);
	}





}
