package com.rutuja.Employee.exception;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rutuja.Employee.EmpError;

@Component
public class ValidationException extends Exception{
	
	List<EmpError> errorList;

	public ValidationException(List<EmpError> errorList) {
		this.errorList=errorList;
	}

	public List<EmpError> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<EmpError> errorList) {
		this.errorList = errorList;
	}

	@Override
	public String toString() {
		return "ValidationException [errorList=" + errorList + "]";
	}
  
	
}
