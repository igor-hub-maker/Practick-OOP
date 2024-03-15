package com.mycompany.practic.calculation;

import static java.lang.Math.*;

/**
 * Клас для знаходження рішення задачі.
 */
public class CalculationMaker implements CalculationMakerInterface{
    static final double g = 9.8;
    // Метод для розв'язання задачі
    @Override
    public CalculationResult calculate(double v, double t, double alpha) {
        double x = v * cos(alpha)*t;
        double y = v * sin(alpha) * t - (g*t*t)/2;
        return new CalculationResult(v, t, alpha, x, y);
    }
}

