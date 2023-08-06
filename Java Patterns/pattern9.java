/*   
 
/*   
 
draw a pattern 
     1
    121
   12321
  1234321   
 123454321
*/
import java.util.*;
class pattern9 {
    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            k=1;
           for(j=1;j<=9;j++)
            {
                if(j>=(6-i) && j<=(4+i)){
                    System.out.print(k);
                    if(j<5)
                        k++;
                    else
                        k--;
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