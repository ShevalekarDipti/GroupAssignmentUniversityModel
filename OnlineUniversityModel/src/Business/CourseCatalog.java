/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dshev
 */
public class CourseCatalog {

    private ArrayList<course> courseCatalog;

    public CourseCatalog(ArrayList<course> courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public ArrayList<course> getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(ArrayList<course> courseCatalog) {
        this.courseCatalog = courseCatalog;
    }
    public Map<String, ArrayList<course>> createProfessorCourseMap() {
        Map<String, ArrayList<course>> mapOfCourse = new HashMap<>();

        for (course course : courseCatalog) {
            String professorName = course.getProfessorName(); 
            if (mapOfCourse.containsKey(professorName)) {
                mapOfCourse.get(professorName).add(course);
            } else {
                ArrayList<course> courses = new ArrayList<>();
                courses.add(course);
                mapOfCourse.put(professorName, courses);
            }
        }

        return mapOfCourse;
    }
}
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    

// Map <String, course> courseMapping = new HashMap<>();
//     ArrayList<HashMap<String, String>> CourseCatalog = new ArrayList<>();
//    
//      private ArrayList <courseMapping> CourseCatalog ;
//        
//         public CourseCatalog() {
//        
//     //   this.CourseCatalog=new ArrayList<course>();
//        
//    }
//         
//         
//  
//
//    public ArrayList<course> getCourseCatalog() {
//        
//        return CourseCatalog;
//    }
//
//    public void setCourseCatalog(ArrayList<course> CourseCatalog) {
//        this.CourseCatalog = CourseCatalog;
//    }
// 
//    
//    public course createCourseCatalog(String courseID, String courseName, String teachingMode){
//       
//        Map <String, course> courseMapping = new HashMap<>();
//        courseMapping.put(courseID)
//                
//        course course = new course();
//        CourseCatalog.add(course);
//        return course;
//    }    
//    
//      public void deleteCourse(course course){
//        CourseCatalog.remove(course);
//    }
//      

