package com.capgemini.PersonOneToMany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.PersonOneToMany.dao.PersonDao;
import com.capgemini.PersonOneToMany.entity.Person;

@Service
public class CertificatesServiceImpl implements CertificatesService
{
	@Autowired
	PersonDao dao;

	@Override
	public Person addNew(Person person) 
	{
		return dao.save(person);
	}

	@Override
	public Person getPerson(int id) 
	{
		 Person person = dao.findById(id).get();
		return person;
	}
	
	


}

