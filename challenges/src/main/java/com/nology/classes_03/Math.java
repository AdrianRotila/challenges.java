package com.nology.classes_03;

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

    public double pow (double number, double power) {
        return java.lang.Math.pow(number, power);
    }
}
