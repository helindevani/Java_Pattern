/*   
 
draw a pattern 
 6543210
 543210
 43210
 3210
 210
 10
 0

*/
import java.util.*;
class pattern15 {
    public static void main(String args[])
    {
        int i,j,k=0;
        for(i=1;i<=7;i++)
        {
            k=7-i;
           for(j=1;j<=7;j++)
            {
                if(j<=8-i){
                    System.out.print(k);
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