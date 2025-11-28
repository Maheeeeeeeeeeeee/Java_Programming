import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findMax
// Description: Compares two integers and prints which one is greater
// Input: int, int
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 27/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a + " is maximum");
        }
        else
        {
            System.out.println(b + " is maximum");
        }
    }
}

class program17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}

