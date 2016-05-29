package org.daniel.javabrains.messenger.tests.modeltests;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by Danielm8686 on 5/28/2016.
 */
@Entity("testsubjects")
public class TestModel {

    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private boolean isCool;

    public TestModel(String firstName, String lastName, boolean isCool){

        this.id = new ObjectId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.isCool = isCool;


    }

    public boolean isCool() {
        return isCool;
    }

    public void setCool(boolean cool) {
        isCool = cool;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




}
