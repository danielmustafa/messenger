package com.daniel.practice.service;

import com.daniel.practice.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danielm8686 on 5/19/2016.
 */
public class MessageService {

    public List<Message> getAllMessages(){
        List<Message> list = new ArrayList<>();
        Message m1 = new Message(1L,"Hello world","Daniel");
        Message m2 = new Message(2L,"Hello jersey","Daniel");
        list.add(m1);
        list.add(m2);

        return list;

    }
}
