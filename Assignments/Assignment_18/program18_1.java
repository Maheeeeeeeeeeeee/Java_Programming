import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
// Function Name: checkPrime
// Description: Checks whether the given number is a prime number and prints the result.
// Input: int 
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 27/11/2025
//
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void checkPrime(int num)
    {
        int iCnt = 0;

        if(num <= 1)
        {
            System.out.println(num + " is not a Prime number");
            return;
        }

        for(iCnt = 2; iCnt <= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {  
                System.out.println(num + " is not a Prime number");
                return;
            }   
        }
    
        System.out.println(num + "  is a Prime number");

    }

}

class program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(10);
    }
}

