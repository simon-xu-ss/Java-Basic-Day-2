import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input several numbers, seperate number by comma");
		
		String input = in.nextLine();
		
		String[] numbers = input.split(",");
		
		int sum = 0;
		
		for (String number : numbers) {
			sum += Integer.parseInt(number);
		}
		
		System.out.println("The sum is: " + sum);			
	}	
}
