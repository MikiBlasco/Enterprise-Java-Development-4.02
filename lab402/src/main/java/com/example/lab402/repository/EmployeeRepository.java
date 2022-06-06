package com.example.lab402.repository;

import com.example.lab402.Enums.Status;
import com.example.lab402.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Optional<Employee> findById(Integer id);
    List<Employee> findByStatus(Status status);

    List<Employee> findByDepartment(String department);





}
