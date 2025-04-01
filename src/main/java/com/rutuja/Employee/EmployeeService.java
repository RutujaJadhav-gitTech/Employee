package com.rutuja.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rutuja.Employee.exception.ServiceException;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
//	private List<Employee> employees=new ArrayList();
// 
//   EmployeeService (){
//	   employees.add(new Employee("1","Rutuja","Jadhav","9529725454","50000","1234"));  
//	   employees.add(new Employee("2","Datta","Jadhav","9529725454","50000","1234"));   
//	   employees.add(new Employee("3","Madhuri","pansabal","9529725454","50000","1234"));   
//	   employees.add(new Employee("4","Manda","pawar","9529725454","50000","1234"));   
//	   employees.add(new Employee("5","Shettal","Kalbhor","9529725454","50000","1234"));   
//   }
   
   
   
	public String addemployee(Employee employee) throws ServiceException {
	    Employee employee2 = employeeRepository.save(employee);
	    if (employee2 != null) {
	        return "Add employee successfully";
	    } else {
	        throw new ServiceException(new EmpError("500", "Not Save Successfully"));
	    }
	}
	   
   
//   public Employee updateEmployee(Employee employee ) {
//	   Employee employee2=  employees.get(Integer.parseInt(employee.getEmpId()));
//	   employee2.setFname(employee.getFname());
//	   employee2.setLname(employee.getLname());
//	   employee2.setMob(employee.getMob());
//	   employee2.setSallary(employee.getSallary());
//	   employee2.setPassword(employee.getPassword());
//	   employees.add(employee2);
//	   return employee2;
//   }
//   
   public Iterable<Employee> getAllEmployee() throws ServiceException{
	   return  employeeRepository.findAll();   
   }
   
   public  String updateEmployee(Employee employee) throws ServiceException{
	    Optional<Employee> employee2=employeeRepository.findById(employee.getEmpId());
	    if(employee2.isPresent()) {   	
	    	employeeRepository.save(employee);
	    	return "Update Successfully";
	    }
	   throw new ServiceException(new EmpError("500", "not update successfully"));
   }
   
   public String deleteEmployee(int id) throws ServiceException {
	   Optional<Employee> employee2=employeeRepository.findById(id);
	    if(employee2.isPresent()) {   	
	    	employeeRepository.deleteById(id);
	    	return "delete Successfully";
	    }
	    else {
	    	throw new ServiceException(new EmpError("500", "Employee not found Successfully"));
	    }
	   
   }
   
}
