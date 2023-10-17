/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.StudentInfoAccess;
import java.util.ArrayList;
import model.Student;


public class StudentRepository implements IStudentRepository {

    @Override
    public void addStudent(ArrayList<Student> s) {
        StudentInfoAccess.Instance().addStudent(s);
    }

    @Override
    public void display(ArrayList<Student> s) {
        StudentInfoAccess.Instance().display(s);
    }

}
