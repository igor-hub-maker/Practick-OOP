/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer_task;

import java.awt.*;
import javax.swing.*;

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
        super.setSize(620,620);
        super.setResizable(true);
        super.setLocationRelativeTo(null);
        
        JPanel mainPanel = new MainPanel();
        
        getContentPane().add(mainPanel);
        
        super.setVisible(true);
    }
    
}
