import java.util.Scanner;
import java.lang.*;

class Hackerrank{
  public static void main(String[] args) {
    Scanner scr = new Scanner (System.in);
    int num = scr.nextInt();
    int [][] a = new int[num][num];
    int sum1 = 0;
    int sum2 = 0;
    int diff;


    for (int i=0; i < num ; i++ ) {
      for (int j=0; j < num ; j++ ) {
        a[i][j] = scr.nextInt();
      }
    }


    for (int i=0; i < num ; i++ ) {
      for (int j=0; j < num ; j++ ) {

        if (i == j) {
          sum1 = sum1 + a[i][j];
        }
        if(j == num-1-i){
          sum2 = sum2 + a[i][j];
        }
      }
    }

    System.out.println("Sum1 is: " + sum1);
    System.out.println("Sum2 is: " + sum2);
    diff = sum1 - sum2;
    diff = Math.abs(diff);
    System.out.println("diff is: " + diff);
  }
}
