package org.daniel.javabrains.messenger.tests.servicetests;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.junit.Assert;
import org.junit.Test;
import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.service.MessageService;

import java.util.ArrayList;
import java.util.List;

public class MessengerServiceTests {



    @Test
    public void getAllMessagesTest(){

        MessageService ms = new MessageService();

        List<String> messageList = ms.getAllMessages();
        System.out.print(messageList);
        Assert.assertEquals(1,messageList.size());



    }


}
