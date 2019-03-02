import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Migration_birds {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int great = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        for (int i=0;i<n ;i++ ) {
          switch(ar[i]){
            case 1 :
              a++;
              break;
            case 2 :
              b++;
              break;
            case 3 :
              c++;
              break;
            case 4 :
              d++;
              break;
            case 5 :
              e++;
              break;
            default:
              f++;
              break;
          }
        }
        if(a>=b && a>=c && a>=d && a>=e){
          great = 1;
        } else if (b>=a && b>=c && b>=d && b>=e) {
          if(b == a){
            great = 1;
          } else {
            great = 2;
          }
        } else if (c>=a && c>=b && c>=d && c>=e) {
          if(c == a){
            great = 1;
          } else if (c == b) {
            great = 2;
          } else {
            great = 3;
          }
        } else if (d>=a && d>=b && d>=c && d>=e) {
          if(d == a){
            great = 1;
          } else if (d == b) {
            great = 2;
          } else if (d == c) {
            great = 3;
          } else {
            great = 4;
          }
        } else if (e>=a && e>=b && e>=c && e>=d) {
          if(e == a){
            great = 1;
          } else if (e == b) {
            great = 2;
          } else if (e == c) {
            great = 3;
          } else if (e == d) {
            great = 4;
          } else {
            great = 5;
          }
        }
        return great;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}