package com.capgemini.PersonOneToMany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.PersonOneToMany.entity.Certificates;
import com.capgemini.PersonOneToMany.entity.Person;
import com.capgemini.PersonOneToMany.service.CertificatesService;

@RestController
public class PersonController 
{
	@Autowired
	private CertificatesService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{
		Set<Certificates> certificates = new HashSet<Certificates>();
		certificates.add(new Certificates(1 , "Java"));
		certificates.add(new Certificates(2 , "Python"));
		return service.addNew(new Person(103, "Shraddha",certificates));
		 
		
	}

	
	@RequestMapping("/get") 
	public Person getPerson() 
	{ 
		Person person = service.getPerson(103);
		return person;
		 
		
	}
	 
	 

}

