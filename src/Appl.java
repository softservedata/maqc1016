public class Appl {

	public static void main(String[] args) {


		String text = "Hello World";
		Box box = new Box();
		box.set(text);
		//Integer i = (Integer) box.get();
		System.out.println(text);


		System.out.println("*/*/*/*/*/*");
		JustForFun jff = new JustForFun();
		System.out.println("Something will happen(sum 1+2)=" + jff.sum(1,2));

	}
	
}
