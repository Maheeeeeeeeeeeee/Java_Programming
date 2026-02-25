import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//      Method Name:    Pattern
//      Description:    Displays a right-shifted numeric pattern based on given rows and columns
//      Input:          int, int
//      Output:         void
//      Author:         Mahesh Dhanyakumar Boke
//      Date:           03-12-2025
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
                if(j < i)
                {
                    System.out.print("\t");
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

class program31_5
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