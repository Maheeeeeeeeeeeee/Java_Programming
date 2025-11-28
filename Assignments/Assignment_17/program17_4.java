import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findMin
// Description: Determines the largest of three integers and prints the maximum
// Input: int, int, int
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 27/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findMin(int a, int b, int c)
    {
        if(a > b && a > c)
        {
            System.out.println(a + " is maximum");
        }
        else if( b > a && b > c)
        {
            System.out.println(b + " is maximum");
        }
        else
        {
            System.out.println(c + " is maximum");
        }
    }
}

class program17_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}

