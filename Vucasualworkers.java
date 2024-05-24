/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.vucasualworkers;

/**
 *
 * @author hp
 */
public class Vucasualworkers {
    public class VU {

    // Method to calculate and print the total pay
    public static void calculatePay(double basePay, int hoursWorked) {
        // Constants
        final double MINIMUM_WAGE = 40000.0;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;
        final double OVERTIME_RATE = 1.5;
        
        // Check if the base pay is less than the minimum wage
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay is below the minimum wage of UGX40,000.00.");
            return;
        }
        
        // Check if the hours worked is more than the maximum allowed hours
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceeds the maximum limit of 60 hours per week.");
            return;
        }

        double totalPay = 0.0;
        
        // Calculate total pay based on hours worked
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * OVERTIME_RATE);
        }
        
        // Print the total pay
        System.out.printf("Total pay is UGX%.2f%n", totalPay);
    }

    // Main method
    public static void main(String[] args) {
        // Employees data
        double[] basePays = {28000.0, 35000.0, 38000.0};
        int[] hoursWorked = {35, 45, 75};
        
        // Calculating pay for each employee
        for (int i = 0; i < basePays.length; i++) {
            System.out.printf("Employee %c:%n", 'A' + i);
            calculatePay(basePays[i], hoursWorked[i]);
        }
    }
    }
}




   
