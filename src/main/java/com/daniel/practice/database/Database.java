package com.daniel.practice.database;

import com.daniel.practice.model.Message;
import com.daniel.practice.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Map<Long,Message> messages = new HashMap<>();
    private static Map<Long,Profile> profiles = new HashMap<>();

    public Database(){

        

    }

    public Map<Long,Message> getMessages(){

        return messages;

    }

    public Map<Long,Profile> getProfiles(){

        return profiles;
    }

}
