package org.daniel.javabrains.messenger.tests.servicetests;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.junit.Assert;
import org.junit.Test;
import org.koushik.javabrains.messenger.database.DatabaseClass;

import java.util.ArrayList;
import java.util.List;

public class MessengerServiceTests {

    DatabaseClass dc = new DatabaseClass();

    @Test
    public void getAllMessagesTest(){
        List<Document> messageList = new ArrayList<>();

        try{
            MongoCollection<Document> messageCollection = dc.getMongoCollection("messenger","messages");

            MongoCursor<Document> cursor = messageCollection.find().iterator();

            try{
                while(cursor.hasNext()){
                    messageList.add(cursor.next());
                }
            } finally{

            }




        } finally {

        }

        System.out.print(messageList);
        Assert.assertEquals(1,messageList.size());



    }


}
