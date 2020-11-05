package com.springboot.derivedmethod.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer personId;
	
private String firstName;

private String lastName;

private Integer age;

private Date createdDate;

private String email;

public Person(String string, String string2, String string3, int i) {

}



public Person( String firstName, String lastName, Integer age, Date createdDate, String email) {
	super();
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.createdDate = createdDate;
	this.email = email;
}



public Integer getPersonId() {
	return personId;
}

public void setPersonId(Integer personId) {
	this.personId = personId;
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

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
			+ ", createdDate=" + createdDate + ", email=" + email + "]";
}


	
	

}
