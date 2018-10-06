//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

//The goals of this program are to undersand how to add $ and % signs into output
import java.util.Scanner; //For input values
import java.text.DecimalFormat; //For using math
import java.text.NumberFormat;//For using $ and % signs
public class Payroll
{
   public static void main(String[] args)
   {
   
   //Variable to store
   String name;
   Double hour, hourpayRate, grossPay, federalTax, stateTax, total, netPay;
   Double federalTaxwithout, stateTaxwithout, federalTaxwith, stateTaxwith;
   
   //Setup input object
   Scanner input = new Scanner(System.in);
   
   //Enter values
   System.out.print("Enter employee's name: ");
   name = input.nextLine();
   System.out.print("Enter number of hours worked in a week: ");
   hour = input.nextDouble();
   System.out.print("Enter hourly pay rate: ");
   hourpayRate = input.nextDouble();
   System.out.print("Enter federal tax withholding rate (as decimal): ");
   federalTaxwithout = input.nextDouble();
   System.out.print("Enter state tax withholding rate (as decimal): ");
   stateTaxwithout = input.nextDouble();
   
   //Number Format
   NumberFormat ft1 = NumberFormat.getCurrencyInstance(); //for $ sign
   NumberFormat ft2 = NumberFormat.getPercentInstance(); //For % sign
   
   //Calculation
   grossPay = hour * hourpayRate;
   federalTax = grossPay*federalTaxwithout;
   stateTax = grossPay*stateTaxwithout;
   total = federalTax + stateTax;
   netPay = grossPay - total;
   
   //Output
   System.out.print("\nEmployee Name: " + name +
                     "\nHours Worked: " + hour +
                     "\nPay Rate: " + ft1.format(hourpayRate)+ 
                     "\n\nGross Pay: " + ft1.format(grossPay)+ 
                     "\nDeductions:" +
                     "\n\tFederal Tax @" + ft2.format(federalTaxwithout) +": " + ft1.format(federalTax) + 
                     "\n\tState Tax @" + ft2.format(stateTaxwithout) + ": " +  ft1.format(stateTax)+
                     "\n\tTotal deduction: " + ft1.format(total)+
                     "\n\tNet Pay: " + ft1.format(netPay));
    }
    }
