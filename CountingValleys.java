/**
 * CountingValleys
 */
import java.util.Scanner;
public class CountingValleys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int result = getValley(num, str);
        System.out.println(result);
    }

    public static int getValley(int n, String str){
        int counter = 0;
        int valeyCount = 0;
        for(int i=0; i< n ; i++){
            if(str.charAt(i) == 'u' || str.charAt(i) == 'U'){
                counter = counter + 1;
            } else if(str.charAt(i) == 'd' || str.charAt(i) == 'D'){
                counter = counter - 1;
                if(counter == -1){
                    ++valeyCount;
                }
            }
            
        }
        return valeyCount;
    }
    
}