/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosalesperson;

/**
 *
 * @author phizz
 */
public class DemoSalesperson
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int startIdNumber = 9999;
        int startSalesDollars = 0;
        Salesperson[] salesEmployees = new Salesperson[10];

        for (int i = 0; i < salesEmployees.length; ++i)
        {
            
            salesEmployees[i] = new Salesperson(startIdNumber, startSalesDollars);
            System.out.print("salesperson " + i + " has a id number of  " + 
                    salesEmployees[i].getIdNumber() + " and a sales value of "+ salesEmployees[i].getSalesValue()+"\n" );
        }

    }

}
