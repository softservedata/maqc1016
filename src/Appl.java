import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Appl {

	public static void main(String[] args) throws IOException {
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
		
		
		//new piece of code by DS:
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your lastname : ");
        String lastname = br.readLine();
        
        System.out.println("Mr./Mrs. " + lastname + ", you have entered two numbers: " + FirstNumber + " and " + SecondNumber);
        
	}

	
}