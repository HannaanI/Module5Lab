/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module5lab;

/**
 *
 * @author hannaan
 */
// Fig. 9.11: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class inherits from CommissionEmployee 
// and accesses the superclass’s private data via inherited 
// public methods.
public class BasePlusCommissionEmployee {
   private double baseSalary; // base salary per week
   private CommissionEmployee employee1;

   // six-argument constructor
   public BasePlusCommissionEmployee(CommissionEmployee employee1, double baseSalary) {
                           

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;
      this.employee1 = employee1;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
      }       

      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary() {return baseSalary;}

   // calculate earnings
public double earnings() {
    return getBaseSalary() + employee1.earnings();
}

// return String representation of BasePlusCommissionEmployee
@Override
public String toString() {
    return String.format("%s %s%n%s: %.2f", "base-salaried",
            employee1.toString(), "base salary", getBaseSalary());
}

}
