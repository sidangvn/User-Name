//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

//Goals of this program is take the specific letter form Finput firstname and lastname and automatically add a random number after the output name.
//Import the Random & Scanner
import java.util.Scanner;
import java.util.Random;
public class Usernames
{
   public static void main(String[] args)
   {
   //Varialbes to store
   String FirstName, LastName, UserName;
   
   //Set up input objects
   Scanner input = new Scanner(System.in);
   
   //The users enter First Name and Last Name
   System.out.print("Enter your first name: ");
   FirstName = input.nextLine();
   System.out.print("Enter your last name: ");
   LastName=input.nextLine();
   
   //Substring First and Last name 
   String First = FirstName.substring(0,1); //It will take the first letter
   String Last = LastName.substring(0,3); //It will take the first three letters
   
   //Automatically create a random number
   Random Number = new Random();
   int num;
   num = Number.nextInt(90)+10; //Create a random number from 10 to 99
   
   //Output First & last name and a random number
   System.out.print("Username: " +First+Last+num);
   }
   }