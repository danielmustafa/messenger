package com.daniel.practice.service;

//import com.daniel.practice.database.Database;


import com.daniel.practice.database.Database;
import com.daniel.practice.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {

    private Map<Long,Message> messages = new Database().getMessages();

    public MessageService(){

        messages.put(1L, new Message(1L,"Daniel","hello world"));
        messages.put(2L, new Message(2L,"Daniel","hello world"));

    }

    public Message addMessage(Message message){

        message.setId(messages.size() + 1L);
        messages.put(message.getId(),message);

        return message;

    }

    public List<Message> getAllMessages(){

        return new ArrayList<Message>(messages.values());


    }

    public Message getMessage(Long id){

        return messages.get(id);

    }

    public Message updateMessage(Long id,Message message){
        if (messages.get(id) == null) {
            return null;
        }
        messages.put(id, message);
        return message;
    }

    public void deleteMessage(Long id){

        messages.remove(id);

    }


}
