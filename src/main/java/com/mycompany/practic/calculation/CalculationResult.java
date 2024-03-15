package com.mycompany.practic.calculation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Клас для зберігання параметрів і результатів обчислень.
 */
public class CalculationResult implements Externalizable {
    // Параметри обчислень
    private double v;
    private double t;
    private double alpha;
    
    // Результат обчислень
    private double x;
    private double y;
    
    // Конструктор класу
    public CalculationResult(double v, double t, double alpha, double x, double y) {
        this.v = v;
        this.t = t;
        this.alpha = alpha;
        this.x = x;
        this.y = y;
    }
    
    public CalculationResult(){}
    
    // Геттери і сеттери
    public double getV() {
        return v;
    }

    public void setV (double v) {
        this.v = v;
    }

    public double getT() {
        return t;
    }

    public void setT (double t) {
        this.t = t;
    }
    
    public double getAlpha() {
        return alpha;
    }

    public void setAlpha (double alpha) {
        this.alpha = alpha;
    }
    

    public double getResultX() {
        return x;
    }
    
    public void setResultX(double x) {
        this.x = x;
    }
    
    public double getResultY() {
        return y;
    }

    public void setResultY(double y) {
        this.y = y;
    }
    
    public String getResult(){
        return "(" + x + ";" + y + ")";
    }
    
    public String setResult(double x, double y)
    {
        this.x = x;
        this.y = y;
        return "("+x+";"+y+")";
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeDouble(v);
        out.writeDouble(t);
        out.writeDouble(alpha);
        out.writeUTF(Double.toHexString(x));
        out.writeUTF(Double.toHexString(y));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        v = in.readDouble();
        t = in.readDouble();
        alpha = in.readDouble();
        x = Double.parseDouble(in.readUTF());
        y = Double.parseDouble(in.readUTF());
    }
}

