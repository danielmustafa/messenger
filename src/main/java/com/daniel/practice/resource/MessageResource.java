package com.daniel.practice.resource;

import com.daniel.practice.model.Message;
import com.daniel.practice.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

        @Path("/messages")
        public class MessageResource {

        MessageService messageService = new MessageService();

        @GET
        @Produces(MediaType.APPLICATION_XML)
        public Map<Long, Message> getMessages() {
            return messageService.getAllMessages();
        }
        //System.out.println("Hello");

        @GET
        @Path("/{messageId}")
        @Produces(MediaType.APPLICATION_XML)
        public Message getMessage(@PathParam("messageId") Long id){
                return messageService.getMessage(id);
        }

}
