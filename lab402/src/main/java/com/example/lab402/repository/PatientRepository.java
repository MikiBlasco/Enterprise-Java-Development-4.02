package com.example.lab402.repository;

import com.example.lab402.Enums.Status;
import com.example.lab402.model.Employee;
import com.example.lab402.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    Optional<Patient> findById(Integer id);

    List<Patient> findByBirthBetween(Date min, Date max);


}
