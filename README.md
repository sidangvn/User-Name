# User-Name - 4

Creating Usernames (10 pts) – Usernames.java
Heron’s formula (20 pts) – Heron.java
Generate a payroll (30 pts) – Payroll.java
 

Creating Usernames

 

Write a program that asks a user for their first and last name (separately). The program then generates a username using the first letter of their first name, the first three letters of their last name and a random number between 10 and 99.

 

You will need:

 

Random and Scanner objects
Variables to store:
The first name
The last name
The username
The charAt method, which extracts the character at the specified index. (See Fig 3.1 in text)
The substring method to extract the letters from the last name
Comments for appropriate documentation such as:
The goal of the program
Input and prompts
Calculations and output
(You can add as many additional comments as you like, but the ones indicated below are the minimum.)

 

 

A sample of the output is shown below:

 

Enter your first name: Schinnel
Enter your last name: Small
Username: SSma17
 

 

 

 

 

 

 

Heron’s Formula

 

Write a program that reads the lengths of the sides of a triangle from the user, and uses Heron’s formula to calculate the area of the triangle.

 

Formula.jpg


 

You should include the following:

 

A Scanner and DecimalFormat object
Variables for the sides, s, and the area
Comments to indicate:
The goal of the program
Input and prompts
Calculations and output
(You can add as many additional comments as you like, but the ones indicated below are the minimum.)

 

A sample of the output is shown below:

 

Enter the length of side 1: 10
Enter the length of side 2: 5.6
Enter the length of side 3: 7.8
Area: 21.753

 

 

Generate a payroll

 

Write a program that prompts the user for:

An employee name
The number of hours worked
The hourly pay rate
The federal tax withholding rate (in decimal format)
The state tax withholding rate (in decimal format)
 

The program should output the information provided plus the following:

Gross Pay (hours * hourly pay rate)
Federal Tax withholding (given percentage of gross)
State Tax withholding (given percentage of gross)
Total Deduction (Federal Tax + State Tax)
Net Pay (Gross Pay – Total Deduction)
 

You will need:

 

Objects for the Scanner and NumberFormat classes (you will need to use the getCurrencyInstance and getPercentInstance)
Variables to store (at a minimum)
An employee name
The number of hours worked
The hourly pay rate
The federal tax withholding rate (in decimal format)
The state tax withholding rate (in decimal format)
You can create additional variables to store the calculated values or you can embed your calculated results in the output. (Tip: Creating additional variables can make it a little easier to debug if corrections are to be made.)

Comments to indicate:
The goal of the program
Input and prompts
Calculations and output
(You can add as many additional comments as you like, but the ones indicated below are the minimum.)

 

A sample of the output is shown below:

 

Enter employee's name: John Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate (as decimal): 0.2
Enter state tax withholding rate (as decimal): 0.09

Employee Name: John Smith
Hours Worked: 10.0
Pay Rate: $9.75

Gross Pay: $97.50
Deductions: 
   Federal Tax @ 20%: $19.50
   State Tax @ 9%: $8.78
   Total deduction: $28.27
   Net Pay: $69.22
