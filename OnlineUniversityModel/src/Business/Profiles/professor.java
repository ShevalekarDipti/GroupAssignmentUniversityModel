/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

/**
 *
 * @author dshev
 */
public class professor {
    
   
    private String profLocation;
    private String profUserName;
    private String profPassword;
    private String profResearchInterest;
    private String profEmail;
    private String providedCourses;

    public String getProfEmail() {
        return profEmail;
    }

    public void setProfEmail(String profEmail) {
        this.profEmail = profEmail;
    }

    public String getProvidedCourses() {
        return providedCourses;
    }

    public void setProvidedCourses(String providedCourses) {
        this.providedCourses = providedCourses;
    }

    public String getProfResearchInterest() {
        return profResearchInterest;
    }

    public void setProfResearchInterest(String profResearchInterest) {
        this.profResearchInterest = profResearchInterest;
    }

    public String getProfLocation() {
        return profLocation;
    }

    public void setProfLocation(String profLocation) {
        this.profLocation = profLocation;
    }

    public String getProfUserName() {
        return profUserName;
    }

    public void setProfUserName(String profUserName) {
        this.profUserName = profUserName;
    }

    public String getProfPassword() {
        return profPassword;
    }

    public void setProfPassword(String profPassword) {
        this.profPassword = profPassword;
    }
 
   
}
