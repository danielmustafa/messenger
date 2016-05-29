package org.koushik.javabrains.messenger.database;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class DatabaseClass {

	private final Morphia morphia = new Morphia();
	private MongoClient mongoClient = new MongoClient("localhost");

	public DatabaseClass(){
	morphia.mapPackage("org.koushik.javabrains.messenger.model");

	}

	public Datastore getDatastore(String dbName){

		return morphia.createDatastore(mongoClient,dbName);


	}

	public void closeConnection(){
		mongoClient.close();
	}

	
}
