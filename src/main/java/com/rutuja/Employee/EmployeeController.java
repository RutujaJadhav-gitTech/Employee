package com.rutuja.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rutuja.Employee.exception.ServiceException;
import com.rutuja.Employee.exception.ValidationException;
import com.rutuja.Employee.validation.SaveValidation;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @Autowired
    private SaveValidation saveValidation;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) throws ServiceException, ValidationException {
        saveValidation.validate(employee);
        return employeeService.addemployee(employee);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        try {
            return employeeService.updateEmployee(employee);
        } catch (ServiceException e) {
            e.printStackTrace();
            return "Error: " + e.getErrorMessage().getErrMsg();
        }
    }

    @GetMapping("/getAllEmployee")
    public Iterable<Employee> getAllEmployee() throws ServiceException {
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        try {
            return employeeService.deleteEmployee(id);
        } catch (ServiceException e) {
            e.printStackTrace();
            return "Error: " + e.getErrorMessage().getErrMsg();
        }
    }
}