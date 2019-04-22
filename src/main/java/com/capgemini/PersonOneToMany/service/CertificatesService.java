package com.capgemini.PersonOneToMany.service;

import com.capgemini.PersonOneToMany.entity.Person;

public interface CertificatesService 
{
	public Person addNew(Person person);
	public Person getPerson(int id);
}
