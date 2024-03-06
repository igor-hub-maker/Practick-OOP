/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic;

import com.mycompany.practic.calculation.*;
import java.util.Scanner;

/**
 *
 * @author igore
 */
public class CalculationWorker {
    CalculationResult result;
    CalculationMakerInterface maker;
    CalculationViewInterface view;
    Scanner in = new Scanner(System.in);
    
    double v = 0;
    double t = 0;
    double alpha = 0;
    
    CalculationWorker(){
       maker = new CalculationMaker();
    }

    public void setV () {
        System.out.println("Please enter v: ");
        this.v = Double.parseDouble(in.nextLine());
    }

    public void setT () {
        System.out.println("Please enter t: ");
        this.t = Double.parseDouble(in.nextLine());
    }

    public void setAlpha () {
        System.out.println("Please enter alpha: ");
        this.alpha = Double.parseDouble(in.nextLine());
    }
    
    public void calculateAndShowResult(){
        calculate();
        view.ViewResults();
    }
    
    public void calculate(){
        tryGetVaribles();
        result = maker.calculate(v, t, alpha);
        view = new CalculationView(result);
    }

    private void tryGetVaribles() {
        if(v == 0) setV();
        if(t == 0) setT();
        if(alpha == 0) setAlpha();
    }
}
