/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practic.calculation;

import java.io.*;
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
public class CalculationResultTest {
    
    private static CalculationResult testResult;
    private static final double v = 10;
    private static final double t = 5;
    private static final double alpha = 5;
    private static final int x = 0;
    private static final int y = 0;
    
    private static final double newV = 15;
    private static final double newT = 7;
    private static final double newAlpha = 7;
    private static final int newX = 20;
    private static final int newY = 20;
    
    
    public CalculationResultTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        testResult = new CalculationResult(v,t,alpha, x, y);
        
    }
    /**
     * Test of getV method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testGetV() {
        System.out.println("getV");
        double result = testResult.getV();
        assertEquals(v, result);
    }

    /**
     * Test of setV method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testSetV() {
        System.out.println("setV");
        testResult.setV(newV);
        assertEquals(newV, testResult.getV());
    }

    /**
     * Test of getT method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testGetT() {
        System.out.println("getT");
        assertEquals(t, testResult.getT(), 0);
    }

    /**
     * Test of setT method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testSetT() {
        System.out.println("setT");
        testResult.setT(newT);
        assertEquals(newT, testResult.getT(), 0);
    }
    
    /**
     * Test of getAlpha method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testGetAlpha() {
        System.out.println("getAlpha");
        double result = testResult.getAlpha();
        assertEquals(alpha, result, 0);
    }

    /**
     * Test of setAlpha method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testSetAlpha() {
        System.out.println("setAlpha");
        testResult.setAlpha(newAlpha);
        assertEquals(newAlpha, testResult.getAlpha(), 0);
    }

    /**
     * Test of getResultX method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testGetResultX() {
        System.out.println("getResultX");
        double result = testResult.getResultX();
        assertEquals(newX, result);
    }
    
    /**
     * Test of getResultY method, of class CalculationResult.
     */
        @org.junit.jupiter.api.Test
    public void testGetResultY() {
        System.out.println("getResultY");
        double result = testResult.getResultY();
        assertEquals(newY, result);
    }

    /**
     * Test of setResult method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testSetResult() {
        System.out.println("setResult");
        testResult.setResult(newX, newY);
        assertEquals(newX, testResult.getResultX());
        assertEquals(newY, testResult.getResultY());
    }
    
        /**
     * Test of setResultX method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testSetResultX() {
        System.out.println("setResultX");
        testResult.setResultX(newX);
        assertEquals(newX, testResult.getResultX());
    }
    
    /**
     * Test of setResultY method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testSetResultY() {
        System.out.println("setResultY");
        testResult.setResultY(newY);
        assertEquals(newY, testResult.getResultY());
    }

    /**
     * Test of writeExternal method, of class CalculationResult.
     */
    @org.junit.jupiter.api.Test
    public void testWriteExternal() throws Exception {
        System.out.println("writeExternal");
        CalculationResult c = new CalculationResult(v, t, alpha, x, y);
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("calculation_result.ser"));
        c.writeExternal(out);
    }

    /**
     * Test of readExternal method, of class CalculationResult.
     */
//    @org.junit.jupiter.api.Test
    public void testReadExternal() throws Exception {
        System.out.println("readExternal");
        testWriteExternal();
        ObjectInput in = new ObjectInputStream(new FileInputStream("calculation_result.ser"));
        CalculationResult c = new CalculationResult();
        c.readExternal(in);
        assertEquals(x, testResult.getResultX());
        assertEquals(y, testResult.getResultY());
    }
    
}
