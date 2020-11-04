package com.springboot.derivedmethod.service;

import java.util.Date;
import java.util.List;

import com.springboot.derivedmethod.entity.Person;

public interface DerivedMethodService {
	
	public List<Person> findbyFirstName(String firstName);	
	public List<Person> findByFirstNameAndLastName(String firstName,String lastName);
	
	public List<Person> findByFirstNameOrLastName(String firstName,String lastName);
	public List<Person> findByAgeLessThanEqual(Integer age);
	public List<Person> findByLastNameOrderByCreatedDateDesc(String lastName);
	public Person findById(Integer personId);
	public Iterable<Person> savePersonsData(List<Person> personList);
	public Iterable<Person> findPersonsById(List<Integer> personList);
	public Iterable<Person> findByFirstNameLike(String firstName);
	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,int age);
	public List<Person> findByCreatedDateBetween(Date startdate,Date endDate);
}
