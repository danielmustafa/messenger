package com.daniel.practice.service;

import com.daniel.practice.Database.Database;
import com.daniel.practice.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MessageService {

    private Map<Long,Message> messages = new Database().getMessages();

    public Map<Long,Message> getAllMessages(){

        return messages;

    }

    public Message getMessage(Long id){

        return messages.get(id);

    }

    public void updateMessage(Long id,Message message){
        if (messages.get(id) != null) {
            messages.put(id, message);
        }
    }

    public void deleteMessage(Long id){

        messages.remove(id);

    }

}
