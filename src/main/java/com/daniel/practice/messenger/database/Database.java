package com.daniel.practice.messenger.database;

import com.daniel.practice.messenger.model.Message;
import com.daniel.practice.messenger.model.Profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    private static Map<Long,Profile> profiles = new HashMap<>();
/*
    private static Map<Long,Message> messages = new HashMap<>();




    public static Map<Long,Message> getMessages(){


        return messages;

    }*/

    public static List<Message> getMessages(){
        List<Message> messages = new ArrayList<>();
        Message m1 = new Message(1L,"test","test");
        Message m2 = new Message(2L,"another test","daniel");
        messages.add(m1);
        messages.add(m2);
        return messages;
    }

    public static Map<Long,Profile> getProfiles(){

        return profiles;
    }

}
