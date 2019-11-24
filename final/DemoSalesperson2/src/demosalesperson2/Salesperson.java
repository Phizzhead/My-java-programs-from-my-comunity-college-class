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
public class Salesperson
{
   // varible declaration section

    private int idNumber;

    private int salesValue;

//constructor declaration section
    public Salesperson(int idNum, int salesVal)
    {
        idNumber = idNum;

        salesValue = salesVal;

    }
    // set method section 

    public void setIdNumber(int numId)
    {
        idNumber = numId;
    }

    public void setSalesValue(int valSales)
    {
        salesValue = valSales;
    }

    //get method section
    public int getIdNumber()
    {
        return idNumber;
    }

    public int getSalesValue()
    {
        return salesValue;
    }
 
}
