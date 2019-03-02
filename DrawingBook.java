/**
 * DrawingBook
 */

import java.util.Scanner;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int page = getPage(m , n);
        System.out.println(page);
        sc.close();
    }

    public static int getPage(int m,int n) {

        int mid = m/2;
        int temp = 0;
        if(n <= mid){
            if(n == 2){
                return 1;
            }
            return(temp = n/2);
        } else {
            temp = m - n;
            if(m%2 == 0){
                if (n == m-1){
                    return 1;
                }
            }
            return (temp / 2);
        }
    }
}