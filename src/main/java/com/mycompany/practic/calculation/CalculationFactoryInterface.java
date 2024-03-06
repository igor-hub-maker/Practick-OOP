/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practic.calculation;

/**
 *
 * @author igore
 */
public interface CalculationFactoryInterface {
    CalculationViewInterface CreateCalculationView(CalculationResult result);
    
    CalculationMakerInterface CreateCalculationMaker();
}
