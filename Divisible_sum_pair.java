import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Divisible_sum_pair {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int a = 0;
        for(int i=1; i<n ; i++){
          a = a + i; 
        }
        int count = 0;
        for(int i=0; i<a ; i++){
          int sum = 0;
          for(int j=i+1;j<n;j++){
            sum = ar[i] + ar[j];
            if(sum % k == 0){
              count = count + 1;
            }
          }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}