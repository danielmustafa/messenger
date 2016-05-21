package com.daniel.practice.service;

//import com.daniel.practice.database.Database;


import com.daniel.practice.database.Database;
import com.daniel.practice.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {

    private Map<Long,Message> messages = new Database().getMessages();

    public List<Message> getAllMessages(){

        return new ArrayList<>(messages.values());

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
