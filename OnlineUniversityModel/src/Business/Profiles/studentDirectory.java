/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Profiles.student;
import java.util.ArrayList;

/**
 *
 * @author dshev
 */
public class studentDirectory {
    private ArrayList <student> studentList ;
    
     public studentDirectory() {
        
        this.studentList=new ArrayList<student>();
        
    }
     
    public ArrayList<student> getstudentList() {
        return studentList;
    }
    
    public student addStudent(){
        student student = new student();
        studentList.add(student);
        return student;
    }
    
       public void deleteStudent(student student){
        studentList.remove(student);
        }
       
     public student searchStudent(String studID){
        for(student student: studentList){
            if(student.getStudID().equals(studID)){
                return student;
            }
        }
        return null; 
    }  
    
    
    
}
