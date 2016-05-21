package com.daniel.practice.resource;

import com.daniel.practice.model.Message;
import com.daniel.practice.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Danielm8686 on 5/19/2016.
 */
        @Path("/messages")
        public class MessageResource {

        MessageService messageService = new MessageService();

        @GET
        @Produces(MediaType.APPLICATION_XML)
        public List<Message> getMessages() {
            return messageService.getAllMessages();
        }
        //System.out.println("Hello");
}
