package com.daniel.practice.messenger.database;

import com.daniel.practice.messenger.model.Message;
import com.daniel.practice.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static Map<Long,Message> messages = new HashMap<>();
    private static Map<Long,Profile> profiles = new HashMap<>();



    public static Map<Long,Message> getMessages(){

        return messages;

    }

    public static Map<Long,Profile> getProfiles(){

        return profiles;
    }

}
