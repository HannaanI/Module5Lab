/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module5lab;

/**
 *
 * @author hannaan
 */
public class hourlyEmployee extends Employee {
    private double hours;
    private double wage;
    
    public hourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wage, double hours) {
    
    super(firstName, lastName, socialSecurityNumber);
    this.hours = hours;
    
}
    
  public double getHours() {
        return hours;
    }

 public void setHours(double hours) {
        if (hours >= 0 && hours <= 168) {
            this.hours = hours;
        }
    }
 
 public double getWage() {
        return wage;
    }
 
  public void setWage(double wage) {
        if (wage >= 0) {
            this.wage = wage;
        }
    }
  
  public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return (40 * wage) + ((hours - 40) * (1.5 * wage));
        }
    }
  
  @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                super.toString(), "wage per hour", wage, "hours worked", hours,
                "earnings", earnings());
    }
}