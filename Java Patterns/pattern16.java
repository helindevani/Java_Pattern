/*   
 
draw a pattern 
     1
    12
   123
  1234
 12345
  1234
   123
    13
     1
*

*/
import java.util.*;
class pattern16 {
    public static void main(String args[])
    {
        int i,j,k=0,x;
        for(i=1;i<=9;i++)
        {
            x=1;
            if(i<6)
                k++;
            else
                k--;
           for(j=1;j<=5;j++)
            {
                if(j>=6-k){
                    System.out.print(x);
                    x++;

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