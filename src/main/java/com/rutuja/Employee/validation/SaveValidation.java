package com.rutuja.Employee.validation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.rutuja.Employee.EmpError;
import com.rutuja.Employee.Employee;
import com.rutuja.Employee.exception.ValidationException;

@Component
public class SaveValidation {

	public void validate(Employee employee) throws ValidationException {
		List<EmpError> errorList=new ArrayList();
		if(ObjectUtils.isEmpty(employee)) {
			errorList.add(new EmpError("400", "Object is null"));
		}else {
			if(StringUtils.isEmpty(employee.getFname())) {
				errorList.add(new EmpError("400", "Fname Name is null"));
			}
           if(StringUtils.isEmpty(employee.getLname())) {
        	   errorList.add(new EmpError("400", "Last Name is null"));
			}
           if(StringUtils.isEmpty(employee.getMob()) || employee.getMob().length() != 10) {
        	   errorList.add(new EmpError("400", "Mob must be 10 digit"));
			}
           if(StringUtils.isEmpty(employee.getSallary())) {
        	   errorList.add(new EmpError("400", "sallary is null"));
			}
           if(StringUtils.isEmpty(employee.getPassword()) || employee.getPassword().length() < 8) {
        	   errorList.add(new EmpError("400", "Password password length must be 8 charecter"));
			}	
		}
		 
		if(!errorList.isEmpty()) {
			throw new ValidationException(errorList);
		}
	}
}
