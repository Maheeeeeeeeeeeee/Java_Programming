import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: displayFactors
// Description: Prints all factors of the given number except the number itself
// Input: int num
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 29/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void displayFactors(int num)
    {
        int iFac = 0;

        for(iFac = 1; iFac <= num/2; iFac++)
        {
            if(num % iFac == 0)
            {
                System.out.println(iFac);
            }
        } 
    }
}

class program21_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}