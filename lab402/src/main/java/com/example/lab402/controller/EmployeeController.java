package com.example.lab402.controller;

import com.example.lab402.Enums.Status;
import com.example.lab402.model.Employee;
import com.example.lab402.repository.EmployeeRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/all-doctors/")
    public List<Employee> getAllDoctors(){
        return employeeRepository.findAll();
    }

    @GetMapping("/findByName/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee findByDoctorId(@PathVariable Integer id) {

        if (employeeRepository.findById(id).isPresent()) {
            return employeeRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @GetMapping("find-status/status/")
    @ResponseStatus(HttpStatus.OK)

    public List<Employee> findDoctorsByStatus(@RequestParam @NotNull Status status) {

        return employeeRepository.findByStatus(status);
    }

    @GetMapping("find-department/department/")
    @ResponseStatus(HttpStatus.OK)

    public List<Employee> findDoctorsByDepartment(@RequestParam @NotNull String department) {

        return employeeRepository.findByDepartment(department);
    }






}
