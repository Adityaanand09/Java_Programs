import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] a) {
        int c =0;
       HashMap<Integer,Integer> h =new HashMap<Integer,Integer>();
       for(int i=0;i<a.length;i++)
       {
           if(h.containsKey(a[i]))
           {
               h.put(a[i],(h.get(a[i])+1));
           }
           else
           h.put(a[i],1);
       }
       for(int i=0;i<a.length;i++)
       {
           if(h.containsKey(a[i]))
           {
               int f=h.get(a[i]);
               if(f==1)
               c=a[i];
           }
       }
      
       return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


/*Sample Input
5
0 0 1 2 1
Sample Output
2*/
