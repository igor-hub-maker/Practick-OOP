/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic;

import com.mycompany.practic.Exceptions.ExitException;
import com.mycompany.practic.calculation.*;
import java.util.Scanner;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;

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

    public void setV () throws ExitException {
        System.out.println("Please enter v: ");
        this.v = Double.parseDouble(getInput());
    }

    public void setT () throws ExitException {
        System.out.println("Please enter t: ");
        this.t = Double.parseDouble(getInput());
    }

    public void setAlpha () throws ExitException {
        System.out.println("Please enter alpha: ");
        this.alpha = Double.parseDouble(getInput());
    }
    
    public void calculateAndShowResult() throws ExitException{
        calculate();
        showResult();
    }
    
    public void showResult(){
        
        view.ViewResults();
    }
    
    public void calculate() throws ExitException{
        tryGetVaribles();
        result = maker.calculate(v, t, alpha);
        view = new CalculationView(result);
    }

    private void tryGetVaribles() throws ExitException {
        if(v == 0) setV();
        if(t == 0) setT();
        if(alpha == 0) setAlpha();
    }
    
    private String getInput() throws ExitException{
        String res = in.nextLine();
        if(res == "exit") throw new ExitException();
        return res;
    }
}
