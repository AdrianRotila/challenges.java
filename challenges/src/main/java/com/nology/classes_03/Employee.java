package com.nology.classes_03;

/**
 * -------------- Foundation -----------------
 *
 * The Employee class represents a generic employee.
 *
 * This is a skeleton of a class you will have to complete it by following these steps.
 * - Adding data fields / properties
 * - Adding a constructor
 * - Implementing three methods
 *
 * Each step is documented through the class.
 *
 */

public class Employee {

    public String name;
    public String position;
    public int rating;
    public int yearsEmployed;
    public int completedDeals;

    public Employee(String name, String position, int rating, int yearsEmployed, int completedDeals) {
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.yearsEmployed = yearsEmployed;
        this.completedDeals = completedDeals;
    }

    public boolean isPromotable() {
        return rating > 7;
    }

    public int calculateDealsPerYear() {
        return completedDeals / yearsEmployed;
    }

    /**
     * Complete the hasBonusQualification method
     *
     * It needs to check if the employee is able to get a bonus.
     *
     * To get a bonus:
     * - They need a rating above 8.
     * - They need a deals per year average greater than or equal to 20.
     *
     * @return boolean if they are eligible for a bonus
     */
    public boolean hasBonusQualification() {

        return rating > 8 && calculateDealsPerYear() >= 20;
    }
}
