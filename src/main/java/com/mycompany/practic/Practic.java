package com.mycompany.practic;

import com.mycompany.practic.Exceptions.ExitException;

public class Practic {

    public static void main(String[] args) {
        try{
            var worker = new CalculationWorker();
            worker.calculateAndShowResult();
        }
        catch(ExitException ex){ System.out.println("Exiting, bye"); }
        catch(Exception e){
            
        }
        
    }
}
