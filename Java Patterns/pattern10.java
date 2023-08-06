/*   
 
draw a pattern 
ABCDCBA
ABC CBA
AB   BA
A     A  

*/
import java.util.*;
class pattern10 {
    public static void main(String args[])
    {
        int i,j;
        char x;
        for(i=1;i<=4;i++)
        {
            x='A';
           for(j=1;j<=7;j++)
            {
                if(j<=(5-i) || j>=(3+i)){
                    System.out.print(x);
                    if(j<4)
                        x++;
                    else
                        x--;
                }
                else
                {
                    System.out.print(" ");
                    if(j==4)
                        x--;
                }
            }
           System.out.println();
        }
        
    }
    
}