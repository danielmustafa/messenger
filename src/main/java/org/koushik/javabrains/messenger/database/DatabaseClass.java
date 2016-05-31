package org.koushik.javabrains.messenger.database;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import java.util.List;

public class DatabaseClass {

	private final Morphia morphia = new Morphia();
	private MongoClient mongoClient = new MongoClient("localhost");
	private Datastore datastore;
	private Query<?> query;

	public DatabaseClass(String dbName, Class className){
	morphia.mapPackage("org.koushik.javabrains.messenger.model");
	this.datastore = morphia.createDatastore(mongoClient,dbName);
	this.query = datastore.createQuery(className);

	}

	public Datastore getDatastore(String dbName){

		return morphia.createDatastore(mongoClient,dbName);


	}

	public void closeConnection(){
		mongoClient.close();
	}

	public List<?> getAll(){

		List list = query.asList();
		return list;

	}
	
}
