package com.daniel.practice.resource;

import com.daniel.practice.model.Message;
import com.daniel.practice.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;



@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Map<Long,Message> getAllMessages(){

        return messageService.getAllMessages();

    }



}
