import java.io.*;
import java.util.*;

public class Hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();

		scan.close();
		System.out.println("Hello, World. \n" + inputString);

	}
}
