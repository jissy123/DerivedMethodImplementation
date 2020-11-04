package com.springboot.derivedmethod.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.derivedmethod.entity.Person;
import com.springboot.derivedmethod.repository.PersonRepository;


@Service
public class DerivedMethodServiceImpl implements DerivedMethodService {
	
	@Autowired
	private PersonRepository personRepo;
	

	@Override
	public List<Person> findbyFirstName(String firstName) {
	
	 return personRepo.findbyFirstName(firstName);
	}

	@Override
	public List<Person> findByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByFirstNameOrLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByAgeLessThanEqual(Integer age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByLastNameOrderByCreatedDateDesc(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findById(Integer personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> savePersonsData(List<Person> personList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> findPersonsById(List<Integer> personList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> findByFirstNameLike(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName, int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByCreatedDateBetween(Date startdate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
