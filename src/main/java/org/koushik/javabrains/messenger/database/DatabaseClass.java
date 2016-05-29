package org.koushik.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;
import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.model.Profile;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class DatabaseClass {

	private final Morphia morphia = new Morphia();

	public DatabaseClass(){
	morphia.mapPackage("org.koushik.javabrains.messenger.model");

	}
	private static Map<ObjectId, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();

	
	public static Map<ObjectId, Message> getMessages() {
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

	public Datastore getDatastore(String dbName){

		return morphia.createDatastore(mongoClient,dbName);


	}

	public void closeConnection(){
		mongoClient.close();
	}
	
	
}
