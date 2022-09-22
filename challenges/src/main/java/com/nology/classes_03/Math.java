package com.nology.classes_03;

/**
 * -------------- Advanced -----------------
 *
 * The Math class is a chance for you to implement your own version of the inbuilt Math class.
 * With additional methods.
 *
 * DO NOT USE THE INBUILT MATH CLASS
 *
 * This is a skeleton of a class you will have to complete it by following these steps.
 * - Adding data fields / properties
 * - Implement getters and setters
 * - Implementing three methods
 *
 * Each step is documented through the class.
 */


public class Math {

    private double pi = 3.141592653589793;

    public double getPI() {
        return pi;
    }

    public void setPI(double pi) {
        if(pi > 3.1 && pi < 3.2) this.pi = pi;
    }

    public double min (double num1, double num2) {
        return java.lang.Math.min(num1, num2);
    }

    public double max (double num1, double num2) {
        return java.lang.Math.max(num1, num2);
    }

    public double calculateCircleArea (double radius) {
        if(radius <= 0) return -1;
        return (radius * radius) * pi;
    }

    public

    /**
     * Complete the pow method
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called pow
     *
     * It raises the first number to the power of the second number and returns the result.
     * The first number is multiplied by itself for the second number of times.
     *
     * HINT: How about a while loop?
     * https://www.w3schools.com/java/java_while_loop.asp
     *
     * @param number The first number to check
     * @param power The second number to check
     * @return double The larger of the two numbers
     */

}
