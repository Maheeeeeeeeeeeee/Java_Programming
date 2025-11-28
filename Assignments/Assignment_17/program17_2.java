import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkPalindrome
// Description: Determines whether the given integer is a palindrome and prints the result
// Input: int
// Output: void
// Author: Mahesh Dhanyakumar Boke
// Date: 27/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPalindrome(int num)
    {
        int iNum = num;
        int iRev = 0;

        while(num > 0)
        {
            int digit = num % 10;
            iRev = (iRev * 10) + digit;
            num = num / 10;
        }

        if(iNum == iRev)
        {
            System.out.println(iNum + " is a palindrome");
        }
        else
        {
            System.out.println(iNum + "is not a palindrome");
        }
    }
}

class program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}