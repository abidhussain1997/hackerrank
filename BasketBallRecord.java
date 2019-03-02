import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BasketBallRecord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int high = s[0];
        int low = s[0];
        int high_record = 0;
        int low_record = 0;
        
        for (int i = 0;i<s.length ;i++ ) {
          if(s[i] > high){
            high = s[i];
            high_record = high_record + 1;
          } else if (s[i] < low) {
            low = s[i];
            low_record = low_record + 1;
          }
        }
        
        System.out.print(high_record + " " + low_record);
    }
}