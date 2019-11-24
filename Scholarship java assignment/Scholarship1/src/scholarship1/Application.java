/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship1;

/**
 *
 * @author phizz
 * 
 */

public class Application 
{
// varible declaration
    private int activities;
    private int service;
    private double gpa;
   
    // named constants
    private static final double HIGH_GPA = 3.8;
    private static final double MIDDLE_GPA = 3.4;
    private static final double LOW_GPA = 3.0;
   
    // constructor
   public Application(int act, int proj, double gp )
   {
    activities = act;
    service = proj;
    gpa = gp;
    
    
   }
           
    // get methods for varibles        
    public int getActivities()
    {
        return activities;
    }
    
    public int getService()
    {
        return service;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
// get methods for named constants
    
    public static double getHighGpa()
    {
        return HIGH_GPA;
    }
    
    public static double getMiddleGpa()
    {
        return MIDDLE_GPA;
    }
    
    public static double getLowGpa()
    {
        return LOW_GPA;
    }
    

    
}
