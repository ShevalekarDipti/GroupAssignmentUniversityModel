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

    public void addHardcodedProfessors() {
        String[] usernames = {"ProfA", "ProfB", "ProfC", "ProfD", "ProfE", "ProfF", "ProfG", "ProfH", "ProfI", "ProfJ"};
        String[] emails = {"profA@example.com", "profB@example.com", "profC@example.com", "profD@example.com", "profE@example.com", "profF@example.com", "profG@example.com", "profH@example.com", "profI@example.com", "profJ@example.com"};
        String[] locations = {"Location A", "Location B", "Location C", "Location D", "Location E", "Location F", "Location G", "Location H", "Location I", "Location J"};
        String[] passwords = {"passA123", "passB456", "passC789", "passD012", "passE345", "passF678", "passG901", "passH234", "passI567", "passJ890"};
        String[] researchInterests = {"Interest A", "Interest B", "Interest C", "Interest D", "Interest E", "Interest F", "Interest G", "Interest H", "Interest I", "Interest J"};

        // Add ten professors with hardcoded values
        for (int i = 0; i < 10; i++) {
            professor newProfessor = new professor();
            newProfessor.setProfUserName(usernames[i]);
            newProfessor.setProfEmail(emails[i]);
            newProfessor.setProfLocation(locations[i]);
            newProfessor.setProfPassword(passwords[i]);
            newProfessor.setProfResearchInterest(researchInterests[i]);

  

            professorList.add(newProfessor);
        }
    }
    
      
}
