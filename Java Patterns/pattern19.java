/*   
 
draw a pattern 


*/
import java.util.*;
class pattern19 {
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=9;i++)
        {
           for(j=1;j<=9;j++)
            {
                if(j>=i && j<=(10-i)){
                    System.out.print("*");

                }
                else
                {
                    System.out.print(" ");
                }
            }
           System.out.println();
        }
        
    }
    
}