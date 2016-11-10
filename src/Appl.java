import java.util.Scanner;

public class Appl {

	public static void main(String[] args) {
		System.out.println("Start me 1");
		String text = "Hello World from Dariia Shevchuk";
		Box box = new Box();
		box.set(text);
//		Integer i = (Integer) box.get();
		System.out.println(text);
		System.out.println("Softserveinc");

		System.out.println("November 11");


		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Please, enter first number");
		int FirstNumber = scanner.nextInt();
		System.out.println("Please, enter second number");
		int SecondNumber = scanner.nextInt();
		System.out.println("The result is next");
		int Result = FirstNumber * SecondNumber;
		System.out.println(Result);
	}

	
}
