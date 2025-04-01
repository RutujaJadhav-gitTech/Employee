package com.rutuja.Employee.exception;

import org.springframework.stereotype.Component;

import com.rutuja.Employee.EmpError;


public class ServiceException extends Exception {

	
	private EmpError errorMessage;

	public ServiceException(EmpError errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public EmpError getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(EmpError errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
