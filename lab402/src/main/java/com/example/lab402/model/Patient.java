package com.example.lab402.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Patient {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String name;
   private Date birth;
   @OneToOne
   @JoinColumn(name = "admitted_by")
   private Employee admitted_by;


   public Patient(String name, Date birth, Employee admitted_by) {
      this.id = id;
      this.name = name;
      this.birth = birth;
      this.admitted_by = admitted_by;
   }

   public Patient() {

   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Date getDate_of_birth() {
      return birth;
   }

   public void setDate_of_birth(Date date_of_birth) {
      this.birth = date_of_birth;
   }

   public Employee getAdmitted_by() {
      return admitted_by;
   }

   public void setAdmitted_by(Employee admitted_by) {
      this.admitted_by = admitted_by;
   }
}
