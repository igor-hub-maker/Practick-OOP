/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer_task;

import java.awt.*;
import javax.swing.*;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChartBuilder;
import com.mycompany.practic.calculation.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import org.knowm.xchart.XYChart;


/**
 *
 * @author igore
 */
public class MainFrame extends JFrame {
    public MainFrame(){
        initialize();
    }

    private void initialize() {
        super.setTitle("MainFrame");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setSize(900,620);
        super.setResizable(true);
        super.setLocationRelativeTo(null);
        
        final XYChart chart = new XYChartBuilder().width(600).height(400).title("Area Chart").xAxisTitle("X").yAxisTitle("Y").build();
        java.util.List<Double> xData = new ArrayList<>();
        java.util.List<Double> yData = new ArrayList<>();
        xData.add(0.0);
        yData.add(0.0);
        chart.addSeries("y(x)", xData, yData);
        JPanel chartPanel = new XChartPanel<XYChart>(chart);
        super.add(chartPanel, BorderLayout.EAST);
        super.add(new MainPanel(chart, chartPanel ,xData, yData), BorderLayout.WEST);
        
        super.pack();
        super.setVisible(true);
    }
    
}
