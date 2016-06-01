package org.daniel.javabrains.messenger.tests.databasetests;



import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;
import org.daniel.javabrains.messenger.tests.modeltests.TestModel;
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

    @Test
    public void update(){
        DatabaseClass dc = new DatabaseClass("test", Message.class);
        dc.updateById("5749b08581649910e80b45c1", TestModel.class,"lastName","Mustachio");


    }








}
