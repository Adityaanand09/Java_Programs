import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        int b[]=new int[6];int max=0,index=0;
        for(int i=0;i < arr.size();i++)
        {
            int number = arr.get(i);
            b[number]++;
        }
       for(int i=1;i<6;i++)
       {
           if(b[i]>max)
           {
               max=b[i];
               index = i;
           }
       }
       return index;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
//Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.
/*Sample Input
11
1 2 3 4 5 4 3 2 1 3 4
Sample Output
3
