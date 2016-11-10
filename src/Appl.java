public class Appl {

	public static void main(String[] args) {

		String text = "Bye-bye, World";
		Box box = new Box();
		box.set(text);
		String i = (String) box.get();
		System.out.println(i + " - worst app ever!"); //byDS
		
		

	}
	
}
