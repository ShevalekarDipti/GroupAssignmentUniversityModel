/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import java.util.ArrayList;


/**
 *
 * @author dshev
 */
public class professorDirectory {
    

    public ArrayList<professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<professor> professorList) {
        this.professorList = professorList;
    }
    
    
    private ArrayList <professor> professorList ;
    
     public professorDirectory() {
        
        this.professorList=new ArrayList<professor>();
        
    }
     
    public ArrayList<professor> getPersonList() {
        return professorList;
    }
    
    public professor addprofessor(){
        professor professor = new professor();
        professorList.add(professor);
        return professor;
    }
    
       public void deleteProfessor(professor professor){
        professorList.remove(professor);
        }
       
     public professor searchPerson(String profName){
        for(professor professor: professorList){
            if(professor.getProfUserName().equals(profName) ){
                return professor;
            }
        }
        return null; 
    }  
      
}
