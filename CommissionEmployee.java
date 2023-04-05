/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hannaan
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module5lab;

/**
 *
 * @author hannaan
 */
public class CommissionEmployee extends Employee {
  private double grossSales; // gross weekly sales
  private double commissionRate; // commission percentage
  

  // five-argument constructor
  public CommissionEmployee(double grossSales,
      double commissionRate, String firstName, String lastName, String socialSecurityNumber) {
    // implicit call to Object constructor occurs here
    super(firstName, lastName, socialSecurityNumber);

    // if grossSales is invalid throw exception
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales must be >= 0.0");
    }

    // if commissionRate is invalid throw exception
    if (commissionRate <= 0.0 || commissionRate >= 1.0) {
      throw new IllegalArgumentException(
          "Commission rate must be > 0.0 and < 1.0");
    }

    this.grossSales = grossSales;
    this.commissionRate = commissionRate;
  }

  // set gross sales amount
  public void setGrossSales(double grossSales) {
    if (grossSales < 0.0) {
      throw new IllegalArgumentException("Gross sales must be >= 0.0");
    }

    this.grossSales = grossSales;
  }

  // return gross sales amount
  public double getGrossSales() {
    return grossSales;
  }

  // set commission rate
  public void setCommissionRate(double commissionRate) {
    if (commissionRate <= 0.0 || commissionRate >= 1.0) {
      throw new IllegalArgumentException(
          "Commission rate must be > 0.0 and < 1.0");
    }

    this.commissionRate = commissionRate;
  }

  // return commission rate
  public double getCommissionRate() {
    return commissionRate;
  }

  // calculate earnings
  public double earnings() {
    return getCommissionRate() * getGrossSales();
  }

  // return String representation of CommissionEmployee object
   @Override 
   public String toString() {
      return super.toString() + String.format("%s: %.2f%n%s: %.2f", 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
  }
}