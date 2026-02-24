import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Displays a pattern where each row has '*' for positions <= row number and '#' otherwise
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
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i > 1 && i < iRow && j > 1 && j < iCol)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            System.out.print("\n");
        }
    }
}

class program30_5
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