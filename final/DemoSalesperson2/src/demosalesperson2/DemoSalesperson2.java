/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosalesperson2;

/**
 *
 * @author phizz
 */
public class DemoSalesperson2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int startIdNumber = 111;
        int startSalesDollars = 25000;
        final int SALES_INCREMENT = 5000;
        Salesperson[] salesEmployees = new Salesperson[10];
        

        for (int i = 0; i < salesEmployees.length; ++i)
        {
            salesEmployees[i] = new Salesperson(startIdNumber + i, startSalesDollars + (i * SALES_INCREMENT));

            System.out.print("salesperson " + i + " has a id number of  "
                    + salesEmployees[i].getIdNumber() + " and a sales value of " + salesEmployees[i].getSalesValue() + "\n");
        }
    }

}
