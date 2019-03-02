/**
 * SockPair
 */

import java.util.Scanner;

public class SockPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] temp = new int[num];
        int count = 0;
        for(int i=0 ; i<num ; i++){
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }

        for(int i=0 ; i<num ; i++){
            int elecount = 1;
            if (temp[i] > 0) {
                for(int j=i+1 ; j < num ; j++){
                    if (temp[i] == temp[j]) {
                        elecount = elecount + 1;
                        temp[j] = -1;
                    }
                }
                if (elecount % 2 != 0) {
                    elecount = elecount -1;
                }
                count = count + elecount/2;
            } else
            continue;

        }
        System.out.println(count); 
    }
}