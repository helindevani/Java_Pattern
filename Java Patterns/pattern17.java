/*   
 
draw a pattern 


*/
import java.util.*;
class pattern17 {
    public static void main(String args[])
    {
        int i,j,k=0;
        for(i=1;i<=7;i++)
        {
           for(j=1;j<=7;j++)
            {
                if(j==i || j==8-i){
                    if(j==i )
                        System.out.print("\\");
                    else
                        System.out.print("/");
                }
                else
                {
                    System.out.print("*");
                   
                }
            }
           System.out.println();
        }
        
    }
    
}