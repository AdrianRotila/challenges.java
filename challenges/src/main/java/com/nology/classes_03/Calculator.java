package com.nology.classes_03;

/**
 * -------------- Intermediate -----------------
 *
 * The Calculator class represents a simple calculator.
 *
 * This is a skeleton of a class you will have to complete it by following these steps.
 * - Adding data fields / properties
 * - Adding a constructor
 * - Implement getters and setters
 * - Implementing methods
 *
 * Each step is documented through the class.
 *
 */

public class Calculator {

    private boolean hasBattery = true;
    private double firstInput;
    private double secondInput;

    public Calculator(double firstInput, double secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    public boolean getHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public double getFirstInput() {
        return firstInput;
    }

    public void setFirstInput(double firstInput) {
        this.firstInput = firstInput;
    }

    public double getSecondInput() {
        return secondInput;
    }

    public void setSecondInput(double secondInput) {
        this.secondInput = secondInput;
    }

    public double calculateAddition () {
        if(!this.hasBattery) return -1;
        return this.firstInput + this.secondInput;
    }

    public double calculateDivision () {
        if(!this.hasBattery) return -1;
        if(this.secondInput == 0) return 0;
        return this.firstInput / this.secondInput;
    }
}
