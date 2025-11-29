import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDigit
// Description: Prints each digit of the given number on a separate line
// Input: int num
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printDigit(int num)
    {
       int iNum = 0, iDigit = 0;

       for(iNum = num; iNum > 0; iNum = iNum / 10)
       {
            iDigit = iNum % 10;
            System.out.println(iDigit);
       }
    }
}

class program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigit(9876);
    }
}