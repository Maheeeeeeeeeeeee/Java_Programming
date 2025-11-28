import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  checkEvenOdd
//      Description:    Checks whether a number is even or odd and prints the result
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           26/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}

class program16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}