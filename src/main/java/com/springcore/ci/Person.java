package com.springcore.ci;

public class Person 
{
	private int personId;
	private String personName;
	private Certificate certificate;
	
	public Person() {
		super();
	
	}

	public Person(int personId, String personName, Certificate certificate) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return this.personId + " : " + this.personName + " : "+ this.certificate.certificateName;
	}
	
	
	
	

}
