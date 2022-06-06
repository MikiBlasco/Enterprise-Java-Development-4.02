package com.example.lab402.controller;

import com.example.lab402.model.Employee;
import com.example.lab402.model.Patient;
import com.example.lab402.repository.PatientRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/all_Patients")
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Patient findByDoctorId(@PathVariable Integer id) {

        if (patientRepository.findById(id).isPresent()) {
            return patientRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @GetMapping("/findByDateRange/date")
    @ResponseStatus(HttpStatus.OK)
    public List<Patient> findByRangeOfBirthDate(@RequestParam @NotNull Date min, @RequestParam @NotNull Date max){
        return patientRepository.findByBirthBetween(min, max);
    }

}
