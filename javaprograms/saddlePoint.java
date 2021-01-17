import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        saddle(a);
    }
    
    public static void saddle(int[][] a)
    {
        int minr=0,maxc=a[0][0];int f=1;int col_index=0;
        for(int i=0;i<a.length;i++)
        {
             minr = a[i][0];
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]<minr)
                {
                    minr=a[i][j];
                    
                col_index = j;
                }
            }
            
            int k=0;
            for(k=0;k<a.length;k++)
            {
                if(a[k][col_index]>a[i][col_index])
                {
                    
                    break;
                }
                
            }
            if(k==a.length)
         {
             System.out.println(minr);
             return;
         }
        
        }
         
          System.out.println("Invalid input");
    }
}
