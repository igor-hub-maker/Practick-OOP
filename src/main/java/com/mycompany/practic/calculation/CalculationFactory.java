/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic.calculation;

/**
 *
 * @author igore
 */
public class CalculationFactory implements  CalculationFactoryInterface{

    @Override
    public CalculationViewInterface CreateCalculationView(CalculationResult result) {
        return new CalculationView(result);
    }

    @Override
    public CalculationMakerInterface CreateCalculationMaker() {
        return new CalculationMaker();
    }
    
}
