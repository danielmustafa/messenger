package org.daniel.javabrains.messenger.tests.servicetests;


import org.daniel.javabrains.messenger.tests.modeltests.TestModel;
import org.junit.Assert;
import org.junit.Test;
import org.koushik.javabrains.messenger.database.DatabaseClass;
import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.service.MessageService;
import org.mongodb.morphia.Datastore;

import java.util.List;

public class MessengerServiceTests {

    DatabaseClass dc = new DatabaseClass();
    private Datastore dctest = dc.getDatastore("test");

    @Test
    public void getAllMessagesTest(){

        MessageService ms = new MessageService();

        List<Message> messageList = ms.getAllMessages();
        Assert.assertEquals(1,messageList.size());


    }

    @Test
    public void addMessageTest(){

        //TestModel test = new TestModel("Daniel","Mustafa",false);
        Message m1 = new Message("This is another test","daniel2");
        dctest.save(m1);



    }


}
