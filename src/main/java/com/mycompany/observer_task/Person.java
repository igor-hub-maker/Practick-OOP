/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer_task;

import java.util.Observable;

/**
 *
 * @author igore
 */
public class Person extends Observable  {
    private String name;
    private String surname;
    private String job;
    
    public Person(String name, String surname, String job){
        this.name = name;
        this.surname = surname;
        this.job = job;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String getJob(){
        return job;
    }
    
    public void setJob(String job){
        this.job = job;
    }
    
    
    @Override
    public String toString(){
        return name + " " + surname+ " is a: " + job;
    }
}
