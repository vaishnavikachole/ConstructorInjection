package com.springcore.ci;

public class Certificate 
{
	 String certificateName;

	public Certificate(String certificateName) {
		super();
		this.certificateName = certificateName;
	}

	@Override
	public String toString() {
		return this.certificateName;
	}
	
	

}
