/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship2;

import java.util.Scanner;

/**
 *
 * @author phizz
 */
public class Scholarship2 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) 
 {
   Scanner s = new Scanner(System.in);
   System.out.print("Please enter the number of extracuricular activities >> ");
   int extraAct = s.nextInt(); 
  
   System.out.print("Please enter the number of community service activities >> ");
   int project = s.nextInt();
    System.out.print("Please enter a grade point average >> ");
     double gradePoints = s.nextDouble();
   
    
     
// object declaration
   Application Application1 = new Application(extraAct, project, gradePoints) ;
   
   // debug tools to cheack what values are getting passed 
   //System.out.println(Application1.getActivities());
   //System.out.println(Application1.getService());
   //System.out.println(Application1.getGpa());
   //System.out.println(Application.getLowGpa());        
   //System.out.println(Application.getMiddleGpa());
   //System.out.println(Application1.getGpa());
   
   if(Application1.getActivities()>= 1 && Application1.getService()>=1 
      && Application1.getGpa()>=Application.getHighGpa())
   {
       System.out.println("Scholarship canidate");
   }
   else if(Application1.getActivities()+ Application1.getService() >=3
           && Application1.getGpa()>= Application.getMiddleGpa() )
   {
       System.out.println("Scholarship Canidate");
   }
   else if(Application1.getActivities()>=2 && Application1.getService()>=3
           && Application1.getGpa()>=Application1.getGpa())
   {
      System.out.println("Scholarship Canidate"); 
   }
       
   else if(Application1.getActivities() == Application.getIntErrorKey()
           || Application1.getService()== Application.getIntErrorKey() )
   {
       System.out.println("Please enter positive integers for activities and community service");
   }
   else if(Application1.getGpa()== Application.getDoubleErrorKey())
   {
       System.out.println("Please enter a gpa greater than zero and less than 4.0");
   }
   else 
   {
       System.out.println("Not a canidate");
   }
   
   
   
   
 }
    
}
