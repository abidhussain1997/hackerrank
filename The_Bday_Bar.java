import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class The_Bday_Bar {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int count = 0;
        for (int i=0;i<(n-m+1);i++ ) {
          int sum = 0;
          for (int j=i;j<(i+m);j++) {
            sum = sum + s[j];
          }
          if(d == sum){
            count = count + 1; 
          }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}