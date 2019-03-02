import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_of_the_programmer {

    static String solve(int year){
        // Complete this function
        int totaldays = 0;
        int day = 0;
        String m = "0";
        String res = "";
        if (year <= 1917) {
          if (year % 4 == 0) {
            totaldays = 215 + 29;
          } else {
            totaldays = 215 + 28;
          }
          day = 256 - totaldays;
          m = "09" ;
          res = String.valueOf(day);
        } else if (year == 1918) {
          day = 26;
          m = "09";
          res = String.valueOf(day);
        } else {
          if(year % 400 == 0){
            totaldays = 215 + 29;
          } else if (year % 4 == 0 && year % 100 != 0) {
            totaldays = 215 + 29;
          } else {
            totaldays = 215 + 28;
          }
          day = 256 - totaldays;
          m = "09" ;
          res = String.valueOf(day);
        }
        
        return res + "." + m + "." + year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
