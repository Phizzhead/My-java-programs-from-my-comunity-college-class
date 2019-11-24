/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship2;

/**
 *
 * @author phizz
 */
public class Application 
{
// varible declaration
    private int activities;
    private int service;
    private double gpa;
    //numbers designated as error codes 
    private static final int INT_ERROR_KEY = -5;
    private static final double DOUBLE_ERROR_KEY= -2.0;
   
    // named constants
    private static final double HIGH_GPA = 3.8;
    private static final double MIDDLE_GPA = 3.4;
    private static final double LOW_GPA = 3.0;
   
    // constructor
   public Application(int act, int proj, double gp )
   {
     if(act>=0)
     { 
         activities = act;
     }
     else 
     {
         activities = INT_ERROR_KEY;
     }
     
     if(proj>=0)
     { 
         service = act;
     }
     else 
     {
         service = INT_ERROR_KEY;
     }
     
     if(gp<=4 && gp>0)
     {
         gpa = gp;
     }
     else
     {
         gpa = DOUBLE_ERROR_KEY;
     }
         
   
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
    
    public static int getIntErrorKey()
    {
        return INT_ERROR_KEY;
    }
    public static double getDoubleErrorKey()
            {
                return DOUBLE_ERROR_KEY;
            }
    

    
}
