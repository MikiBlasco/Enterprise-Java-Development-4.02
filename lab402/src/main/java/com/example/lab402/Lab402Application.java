package com.example.lab402;

import com.example.lab402.Enums.Status;
import com.example.lab402.controller.EmployeeController;
import com.example.lab402.model.Employee;
import com.example.lab402.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab402Application {

	public static void main(String[] args) {



		/*Employee e1 = new Employee("cardiology", "Alonso Flores", Status.ON_CALL);
		Employee e2 = new Employee("immunology", "Sam Ortega", Status.ON);
		Employee e3 = new Employee("cardiology", "German Ruiz", Status.OFF);
		Employee e4 = new Employee("pulmonary", "Maria Lin", Status.ON);
		Employee e5 = new Employee("orthopaedic", "Paolo Rodriguez", Status.ON_CALL);
		Employee e6 = new Employee("psychiatric", "John Paul Armes", Status.OFF);*/



		SpringApplication.run(Lab402Application.class, args);


	}

}
