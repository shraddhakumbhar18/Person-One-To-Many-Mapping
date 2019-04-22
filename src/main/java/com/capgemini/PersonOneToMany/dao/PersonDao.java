package com.capgemini.PersonOneToMany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.PersonOneToMany.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
