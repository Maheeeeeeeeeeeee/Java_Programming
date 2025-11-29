import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkDivisible
// Description: Checks if the given number is divisible by both 5 and 11 and prints the result
// Input: int num
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkDivisible(int num)
    {
        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println(num + " is divisible by 5 and 11");
        }
        else
        {
            System.out.println(num + " is not divisible by 5 and 11");
        }
    }
}

class program19_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}