package com.springboot.derivedmethod.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.derivedmethod.entity.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person,Integer>{
	
public List<Person> findbyFirstName(String firstName);	
	
public List<Person> findByFirstNameAndLastName(String firstName,String lastName);	

public List<Person> findByFirstNameOrLastName(String firstName,String lastName);	

public List<Person> findByLastNameOrderByCreatedDateDesc(String lastName);

public List<Person> findByAgeLessThanEqual(Integer age);

public List<Person> findbyFirstNameLike(String firstName);


public List<Person> findByLastNameAndAgeLessThanEqual(String lastName, Integer age);

public List<Person> findByCreatedDateBetween(Date startDate,Date endDate);

}
