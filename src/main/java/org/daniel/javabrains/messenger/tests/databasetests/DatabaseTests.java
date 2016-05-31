package org.daniel.javabrains.messenger.tests.databasetests;



import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.junit.Test;
import org.junit.Assert;
import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Message;
import org.mongodb.morphia.Datastore;


public class DatabaseTests {

    @Test
    public void connectToDatabase(){

        MongoClient mc = new MongoClient("localhost");
        MongoDatabase db;

        try {

            db = mc.getDatabase("messages");
            Assert.assertNotNull(db);

        }
        finally {
            mc.close();
        }

    }

    @Test
    public void getDataStore(){

            DatabaseClass dc = new DatabaseClass("messenger", Message.class);



        }








}
