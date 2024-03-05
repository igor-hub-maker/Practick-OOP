/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic.calculation;

/**
 *
 * @author igore
 */
public class CalculationView implements CalculationViewInterface{
    private final CalculationResult result;
    
    public CalculationView(CalculationResult result){
        this.result = result;
    }
    
    @Override
    public void ViewV() {
        System.out.println(result.getV());
    }

    @Override
    public void ViewT() {
        System.out.println(result.getT());
    }

    @Override
    public void ViewAlpha() {
        System.out.println(result.getAlpha());
    }

    @Override
    public void ViewResultX() {
        System.out.println(result.getResultX());
    }

    @Override
    public void ViewResultY() {
        System.out.println(result.getResultY());
    }

    @Override
    public void ViewResults() {
        String x = result.getResultX();
        String y = result.getResultY();
        System.out.println("(" +x+";" + y+")");
    }
    
}
