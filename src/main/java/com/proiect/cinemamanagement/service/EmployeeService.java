package com.proiect.cinemamanagement.service;

import com.proiect.cinemamanagement.dao.Employee;
import com.proiect.cinemamanagement.entity.EmployeeEntity;
import com.proiect.cinemamanagement.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //add
    public EmployeeEntity processPostEmployee(Employee employee){
        EmployeeEntity employeeEntity=new EmployeeEntity(employee);

        log.info("employee for add", employee);
        if(employee.getSalary()<0){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,  "Request body parameters salary should be positive number.");
        }
        return employeeRepository.save(employeeEntity);
    }

    //get all
    public Iterable<EmployeeEntity> processGetEmployees() {
        return employeeRepository.findAll();
    }

    //get by name
    public Iterable<EmployeeEntity> processFindByFirstNameContaining(String firstName) {
        return employeeRepository.findByFirstNameContaining(firstName);
    }

    //get by id
    public EmployeeEntity processGetEmployee(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    //delete
    public void processDeleteEmployee(Integer id){

        employeeRepository.deleteById(id);
    }

    //put

    public EmployeeEntity processPutEmployee(Integer id, Employee employee){
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        if(employeeEntity == null){
            return null;
        }
        employeeEntity.setSalary(employee.getSalary());
        employeeEntity.setPosition(employee.getPosition());

        return employeeRepository.save(employeeEntity);
    }
}

