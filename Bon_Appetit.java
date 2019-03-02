import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bon_Appetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int sum = 0;
        for (int i=0;i<n ;i++ ) {
          if(i == k){
            continue;
          } else {
            sum = sum + ar[i];
          }
        }
        if ((sum/2) != b) {
          System.out.println((b - (sum/2)));
        } else {
          System.out.println("Bon Appetit");
        }
    }
}
