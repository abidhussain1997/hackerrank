/**
 * CountingValleys
 */
import java.util.Scanner;
public class ElectronicsShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = sc.nextInt();
        int keyboard = sc.nextInt();
        int drive = sc.nextInt();
        int[] keyboardArr = new int[keyboard];
        int[] driveArr = new int[drive];
        for(int i = 0 ; i < keyboard ; i++){
            keyboardArr[i] = sc.nextInt();
        }
        for(int i = 0 ; i< drive ; i++){
            driveArr[i] = sc.nextInt();
        }

        int result = getPrice(keyboardArr, driveArr, budget);
        System.out.println(result);
    }

    public static int getPrice(int[] keyboard, int[] drive, int budget){
        int max = -1;
        for (int i = 0 ; i < keyboard.length ; i++){
            for(int j = 0 ; j < drive.length ; j++){
                if(budget >= keyboard[i] + drive[j]){
                    if(max < keyboard[i] + drive[j]){
                        max = keyboard[i] + drive[j];
                    }
                }
            }
        }
        return max;
    }
    
}