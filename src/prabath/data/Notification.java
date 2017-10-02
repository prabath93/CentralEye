/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prabath.data;

import chanaka.data.Student;

/**
 *
 * @author prabath s
 */
public class Notification {

    String typeOfPersonTryToChange;
    String nameWhoChange;
    String typeOfPersonGoingToBeChanged;
     String nameWhoGoingtoBeChanged;
     Teacher teacher;
    Object object;
    Student student;

    public Notification(String typeOfPersonTryToChange, String nameWhoChange, String typeOfPesonGoingToBeChanged, String nameWhoGoingtoBeChanged, Teacher teacher) {
        this.nameWhoChange=nameWhoChange;
        this.nameWhoGoingtoBeChanged=nameWhoGoingtoBeChanged;
        this.teacher=teacher;
        this.typeOfPersonTryToChange=typeOfPersonTryToChange;
        this.typeOfPersonGoingToBeChanged=typeOfPesonGoingToBeChanged;
    }
    public Notification(String typeOfPersonTryToChange, String nameWhoChange, String typeOfPesonGoingToBeChanged, String nameWhoGoingtoBeChanged, Student student) {
        this.nameWhoChange=nameWhoChange;
        this.nameWhoGoingtoBeChanged=nameWhoGoingtoBeChanged;
        this.student=student;
        this.typeOfPersonTryToChange=typeOfPersonTryToChange;
        this.typeOfPersonGoingToBeChanged=typeOfPesonGoingToBeChanged;
    }

    public String getTypeOfPersonTryToChange() {
        return typeOfPersonTryToChange;
    }

    public void setTypeOfPersonTryToChange(String typeOfPersonTryToChange) {
        this.typeOfPersonTryToChange = typeOfPersonTryToChange;
    }

    public String getNameWhoChange() {
        return nameWhoChange;
    }

    public void setNameWhoChange(String nameWhoChange) {
        this.nameWhoChange = nameWhoChange;
    }

    public String getTypeOfPersonGoingToBeChanged() {
        return typeOfPersonGoingToBeChanged;
    }

    public void setTypeOfPersonGoingToBeChanged(String typeOfPersonGoingToBeChanged) {
        this.typeOfPersonGoingToBeChanged = typeOfPersonGoingToBeChanged;
    }

    public String getNameWhoGoingtoBeChanged() {
        return nameWhoGoingtoBeChanged;
    }

    public void setNameWhoGoingtoBeChanged(String nameWhoGoingtoBeChanged) {
        this.nameWhoGoingtoBeChanged = nameWhoGoingtoBeChanged;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    
   

}
