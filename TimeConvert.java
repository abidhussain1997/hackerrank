import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConvert {

    static String timeConversion(String s) {
        // Complete this function
        if (s.charAt(8) == 'A') {
          int h = Integer.parseInt(s.substring(0,2));
          String hour = Integer.toString(h);
          if (h == 12) {
             hour = "00";
             s = hour + s.substring(2, 8);
          }else if(h < 10){
              s = "0" + hour + s.substring(2, 8);
          } else{
            s = hour + s.substring(2, 8);
          }

        } else {
          int h = Integer.parseInt(s.substring(0,2)) + 12;
          String hour = Integer.toString(h);
          if (h == 24) {
             hour = "12";
          }
          s = hour + s.substring(2, 8);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
