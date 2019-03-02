import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatAndMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {

        int cat1Dist = 0;
        int cat2Dist = 0;
        String winner = "";

        if(z > x ) {
            cat1Dist = z - x;
        } else {
            cat1Dist = x - z;
        }

        if(z > y){
            cat2Dist = z - y;
        } else {
            cat2Dist = y - z;
        }

        if(cat1Dist < cat2Dist){
            winner = "Cat A";
        } else if(cat2Dist < cat1Dist){
            winner = "Cat B";
        } else if(cat1Dist == cat2Dist){
            winner = "Mouse C";
        }

        return winner;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            System.out.println(result);
        }

        scanner.close();
    }
}
