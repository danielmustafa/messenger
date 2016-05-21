package com.daniel.practice.messenger.resource;

import com.daniel.practice.messenger.service.MessageService;
import com.daniel.practice.messenger.model.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GET
    @Path("/wtf")
    @Produces(MediaType.APPLICATION_XML)
    public String wtf(){
        return "WHAT THE FUCK";
    }


}
