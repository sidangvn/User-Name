//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

//Goals of this program is calculate the area and round the output number to 3 decimals
import java.util.Scanner; //For input values
import java.text.DecimalFormat; //For using math
public class Heron
{
   public static void main(String[] args)
   {
   //Variables to store
   Double a, b, c, s, area;
   
   //Set up input object
   Scanner input= new Scanner(System.in);
   
   //Enter values
   System.out.print("Enter the length of side 1: ");
   a = input.nextDouble();
   System.out.print("Enter the length of side 2: ");
   b = input.nextDouble();
   System.out.print("Enter the length of side 3: ");
   c = input.nextDouble();
   
   //Calculation
   s =(a+b+c)/2; //find s
   area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); //Find area with square root
   
   //Round the value into 3 decimals
   DecimalFormat fmt = new DecimalFormat ("0.###");
   
   //Output area
   System.out.print("Area: " + fmt.format(area));
   }
   }