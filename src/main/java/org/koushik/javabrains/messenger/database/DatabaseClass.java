package org.koushik.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();

	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}

	private MongoClient mongoClient = new MongoClient("localhost");


	public MongoCollection getMongoCollection(String dbName, String collectionName){

		MongoDatabase mdb = mongoClient.getDatabase(dbName);

		return mdb.getCollection(collectionName);




	}

	
	
}
