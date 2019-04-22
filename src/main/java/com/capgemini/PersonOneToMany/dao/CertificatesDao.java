package com.capgemini.PersonOneToMany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.PersonOneToMany.entity.Certificates;

@Repository
public interface CertificatesDao extends JpaRepository<Certificates, Integer> {

}
