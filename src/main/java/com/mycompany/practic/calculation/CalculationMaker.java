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
        int x = (int) (v* cos(alpha)*t);
        int y = (int) (v * sin(alpha) * t - (g*t*t)/2);
        String xHex = Integer.toHexString(x);
        String yHex = Integer.toHexString(y);
        return new CalculationResult(v, t, alpha, xHex, yHex);
    }
}

