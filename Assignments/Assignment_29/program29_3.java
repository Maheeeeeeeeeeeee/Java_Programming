import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Displays a pattern with alternating rows of lowercase letters and numbers. Odd rows display consecutive letters starting from 'a', even rows display consecutive numbers starting from 1
//      Input:          int, int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           01-12-2025
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Display
{
    public void Pattern(int iRow, int iCol)
    {
        int iP1 = 0, iP2 = 0;
        char ch = 'a';

        for(iP1 = 1; iP1 <= iRow; iP1++)
        {   
            if(iP1 % 2 != 0)
            {
                ch = 'a';
                for(iP2 = 1; iP2 <= iCol; iP2++)
                {
                    System.out.print(ch+"\t");
                    ch++;
                }
            }  
            else
            {
                for(iP2 = 1; iP2 <= iCol; iP2++)
                {
                    System.out.print(iP2+"\t");
                }
            } 
            System.out.print("\n");
        }   
    }
}

class program29_3
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner eobj = new Scanner(System.in);
        System.out.print("Enter number of rows and columns : ");
        iValue1 = eobj.nextInt();
        iValue2 = eobj.nextInt();
    
        Display dobj = new Display();
        dobj.Pattern(iValue1, iValue2);
    
    }
}