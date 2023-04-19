/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Students implements Serializable{
    String sClass;
    String Name;
    String Course;
    double Score;

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String Class) {
        this.sClass = Class;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double Score) {
        this.Score = Score;
    }

    public Students(String sClass, String Name, String Course, double Score) {
        this.sClass = sClass;
        this.Name = Name;
        this.Course = Course;
        this.Score = Score;
    }

    

    

    
    
    
}
