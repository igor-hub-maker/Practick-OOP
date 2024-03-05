/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practic.calculation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author igore
 */
public class CalculationMakerTest {
    
    public CalculationMakerTest() {
    }

    /**
     * Test of calculate method, of class CalculationMaker.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        CalculationMakerInterface maker = new CalculationMaker();
        double v = 15;
        double t = 7;
        double alpha = 30;
        var instance = maker.calculate(v, t, alpha);
        String expX = Integer.toHexString(16);
        String expY = Integer.toHexString(-343);
        assertEquals(expX, instance.getResultX());
        assertEquals(expY, instance.getResultY());
    }
    
}
