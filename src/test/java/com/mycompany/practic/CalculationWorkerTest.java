/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practic;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author igore
 */
public class CalculationWorkerTest {
    
    public CalculationWorkerTest() {
    }

    /**
     * Test of setV method, of class CalculationWorker.
     */
    @Test
    public void testSetV() {
        System.out.println("setV");
        CalculationWorker instance = new CalculationWorker();
        double num = 5;
        instance.setV();
        assertEquals(instance.v, num);
    }

    /**
     * Test of setT method, of class CalculationWorker.
     */
    @Test
    public void testSetT() {
        System.out.println("setT");
        CalculationWorker instance = new CalculationWorker();
        double num = 5;
        instance.setT();
        assertEquals(instance.t, num);
    }

    /**
     * Test of setAlpha method, of class CalculationWorker.
     */
    @Test
    public void testSetAlpha() {
        System.out.println("setAlpha");
        CalculationWorker instance = new CalculationWorker();
        double num = 5;
        instance.setAlpha();
        assertEquals(instance.alpha, num);
    }

    /**
     * Test of calculateAndShowResult method, of class CalculationWorker.
     */
    @Test
    public void testCalculateAndShowResult() {
        System.out.println("calculateAndShowResult");
        CalculationWorker instance = new CalculationWorker();
        instance.calculateAndShowResult();
        String expX = Integer.toHexString(16);
        String expY = Integer.toHexString(-343);
         assertEquals(instance.result.getResult(), "(" + expX+";"+expY+")");
    }

    /**
     * Test of calculate method, of class CalculationWorker.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        CalculationWorker instance = new CalculationWorker();
        instance.calculate();
        String expX = Integer.toHexString(16);
        String expY = Integer.toHexString(-343);
        assertEquals(instance.result.getResult(), "(" + expX+";"+expY+")");
    }
    
}
