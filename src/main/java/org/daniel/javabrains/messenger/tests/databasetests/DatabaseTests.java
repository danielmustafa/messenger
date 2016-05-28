package org.daniel.javabrains.messenger.tests.databasetests;



import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.junit.Test;
import org.junit.Assert;


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

}
