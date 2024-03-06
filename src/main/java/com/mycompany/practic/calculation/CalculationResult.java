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
    private String x;
    private String y;
    
    // Конструктор класу
    public CalculationResult(double v, double t, double alpha, String x, String y) {
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
    

    public String getResultX() {
        return x;
    }
    
    public String setResultX(String x) {
        this.x = x;
        return x;
    }
    
    public int setResultX(int x) {
        this.x = Integer.toHexString(x);
        return x;
    }
    
    public String getResultY() {
        return y;
    }

    public void setResultY(String y) {
        this.y = y;
    }
    
    public int setResultY(int y) {
        this.y = Integer.toHexString(y);
        return y;
    }
    
    public String getResult(){
        return "(" + x + ";" + y + ")";
    }
    
    public String setResult(String x, String y)
    {
        this.x = x;
        this.y = y;
        return "("+x+";"+y+")";
    }
    
    public String setResult(int x, int y)
    {
        this.x = Integer.toHexString(x);
        this.y = Integer.toHexString(y);
        return "("+x+";"+y+")";
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeDouble(v);
        out.writeDouble(t);
        out.writeDouble(alpha);
        out.writeUTF(x);
        out.writeUTF(y);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        v = in.readDouble();
        t = in.readDouble();
        alpha = in.readDouble();
        x = in.readUTF();
        y = in.readUTF();
    }
}

