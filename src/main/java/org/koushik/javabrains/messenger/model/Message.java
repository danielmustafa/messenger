package org.koushik.javabrains.messenger.model;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.PostLoad;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity("messages")
public class Message {



	@Id
	private ObjectId id;
    private String message;
    @Property
	private Date created;
    @Property
	private String author;
    
    public Message() {
    	
    }
    
    public Message(String message, String author) {
    	this.message = message;
    	this.author = author;
    	this.created = new Date();
    }
    
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}

	
}
