package com.daniel.practice.model;

import java.util.Date;

/**
 * Created by Danielm8686 on 5/19/2016.
 */
public class Message {

    String author;
    String message;
    Date createDate;
    Long id;

    public Message(){

    }

    public Message(Long id, String author, String message){

        this.id = id;
        this.author = author;
        this.message = message;
        this.createDate = new Date();


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }




}
