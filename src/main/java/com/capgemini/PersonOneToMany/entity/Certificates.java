package com.capgemini.PersonOneToMany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Certificates 
{
	@Id
	private int certificateId;
	private String description;
	
	@ManyToOne
	private Person person;
	
	public Certificates() 
	{
		super();
	}
	public Certificates(int certificateId, String description) 
	{
		super();
		this.certificateId = certificateId;
		this.description = description;
		//this.person = person;
	}
	public int getCertificateId() 
	{
		return certificateId;
	}
	public void setCertificateId(int certificateId) 
	{
		this.certificateId = certificateId;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	@Override
	public String toString() {
		return "Certificates [certificateId=" + certificateId + ", description=" + description + ", person=" + person
				+ "]";
	}
	
	
	
}
