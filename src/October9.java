import java.util.Scanner;

public class October9 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Hello, what is your name?");
		String name = scnr.nextLine();
				
		int x = 0;
		
		while (true) {
			System.out.println("Okay, " + name + ", please select a number between 1 and 100.");
			x = scnr.nextInt();
			if (x >= 0 && x <= 100) {
				break;
			}
		}
	
		if (x >= 2 && x <= 25 && x % 2 == 0) {
			System.out.println("The number you selected is even and less than 25.");
		}
		else if (x >= 26 && x <= 60 && x % 2 == 0) {
			System.out.println("The number you selected is even.");
		}
		else if (x > 60 && x % 2 == 0) {
			System.out.println("You selected: " + x + ", is even.");
		}
		else if (x > 60 && x % 2 == 1) {
			System.out.println("You selected: " + x + ", is odd and greater than 60.");
		} 
		else if (x % 2 == 1) {
			System.out.println("You selected: " + x + ", which is odd.");
		}
		System.exit(0);
	} 
}

