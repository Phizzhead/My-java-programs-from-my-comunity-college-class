/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demonstratingstringmethods;

/**
 *
 * @author phizz
 */
public class DemonstratingStringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // object declaration section
        StringBuilder quote = new StringBuilder("You can never cross the ocean "
    +"until you have the courage to lose sight of the shore. -Christopher Columbus");
        
       
        
        System.out.println("index of v is ...");
        System.out.println(quote.indexOf("v"));
        
        System.out.println("index of x is ...");
        System.out.println(quote.indexOf("x"));
        
        System.out.println("the char at 16 is ...");
        System.out.println(quote.charAt(16));
        
       
        String quoteString = quote.toString();
        System.out.println("does quote end with bus");
        System.out.println(quoteString.endsWith("bus"));
        System.out.println("does the quote end with car");
        System.out.println(quoteString.endsWith("car"));
        System.out.println("the quote is");
        System.out.println(quote);
        
        //quote.replace(1, 5 , "'c','C'");
        // probabaly not what u want
        System.out.println("the quote with a replacment is ");
        System.out.println(quoteString.replace('c','C'));
        
        
        
        
        
        
        
        
        
       
        
        
    }

}
