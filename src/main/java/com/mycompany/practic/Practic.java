package com.mycompany.practic;

import com.mycompany.practic.calculation.*;

public class Practic {

    public static void main(String[] args) {
        CalculationMakerInterface maker = new CalculationMaker();
        double v = 15;
        double t = 7;
        double alpha = 30;
        var instance = maker.calculate(v, t, alpha);
        CalculationViewInterface view = new CalculationView(instance);
        view.ViewV();
        view.ViewT();
        view.ViewAlpha();
        view.ViewResultX();
        view.ViewResultY();
        view.ViewResults();
    }
}
