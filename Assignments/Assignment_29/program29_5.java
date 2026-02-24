import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Displays a pattern of consecutive numbers with each row starting from its row number
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

        for(iP1 = 1; iP1 <= iRow; iP1++)
        {   
            if(iP1 % 2 != 0)
            {
                for(iP2 = iP1; iP2 <= iCol+iP1-1; iP2++)
                {
                    System.out.print(iP2+"\t");
                }
            }  
            else
            {
                for(iP2 = iP1; iP2 <= iCol+iP1-1; iP2++)
                {
                    System.out.print(iP2+"\t");
                }
            } 
            System.out.print("\n");
        }   
    }
}

class program29_5
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