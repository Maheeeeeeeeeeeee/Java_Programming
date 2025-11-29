import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: displayGrade
// Description: Determines and prints the grade based on the given marks
// Input: int marks
// Output: void 
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int marks)
    {
        if(marks > 100)
        {
            System.out.println("Invalid marks");
        }
        else if(marks > 90)
        {
            System.out.println("Grade A");
        }
        else if(marks > 75)
        {
            System.out.println("Grade B");
        }
        else if(marks > 60)
        {
            System.out.println("Grade C");
        }
        else if(marks > 45)
        {
            System.out.println("Grade D");
        }
        else if(marks > 33)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

class program19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}