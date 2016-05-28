package org.daniel.javabrains.messenger.tests.databasetests;

/**
 * Created by Danielm8686 on 5/27/2016.
 */

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import org.junit.Test;
import org.junit.Assert;

public class DatabaseTests {

    @Test
    public void connectToDatabase(){

        MongoClient mongoClient = new MongoClient("localhost");

        MongoDatabase db;

        try {

            db = mongoClient.getDatabase("test");
            Assert.assertNotNull(db);
        }
        finally{

            mongoClient.close();

        }



    }

}
