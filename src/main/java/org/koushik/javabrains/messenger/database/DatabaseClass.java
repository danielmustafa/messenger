package org.koushik.javabrains.messenger.database;

import com.mongodb.MongoClient;
import com.mongodb.operation.UpdateOperation;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

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

	public List<?> getAll(){

		return query.asList();
	}

	public Object getById(Object input){

		return query.field("id").equal(input.toString()).get();
	}

	public Object updateById(String id,Class classType,String fieldName, String newValue){

		Query<?> query = datastore.createQuery(classType).filter("id =", id);
		UpdateOperations<Object> update = datastore.createUpdateOperations(classType).set(fieldName,newValue);
		return datastore.update(query, update);


	}
	
}
