import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Function Name:  checkLeapYear
//      Description:    Checks whether the given year is a leap year based on standard leap-year rules
//      Input:          int 
//      Output:         void 
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           29/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkLeapYear(int year)
    {
        int iLp = 0;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}

class program19_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}