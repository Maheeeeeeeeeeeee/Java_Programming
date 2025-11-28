import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  checkSign
//      Description:    Checks whether a number is positive, negative, or zero and prints the result
//      Input:          int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           27/11/2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
        {
            System.out.println("Number is positive"); 
        }
        else if(num < 0)
        {
            System.out.println("Number is negative"); 
        }
        else
        {
            System.out.println("Number is zero"); 
        }
    }
}

class program18_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}