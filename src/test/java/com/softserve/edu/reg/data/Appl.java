package com.softserve.edu.reg.data;

public class Appl {

	public static void main(String[] args) {
		// 1. Use constructor and setter
//		User user = new User("firstname1", "lastname1", "email1",
//				"login1", "password1", "community1");
//		user.setCity("city1");
		//
		// 2. Use default constructor and setters
//		User user = new User();
//		user.setFirstname("firstname2");
//		user.setLastname("lastname2");
//		user.setEmail("email2");
//		user.setLogin("login2");
//		user.setPassword("password2");
//		user.setCommunity("community2");
//		user.setCity("city2");
		//
		// 3. Use constructor and fluent interface
		//User user = new User("firstname1", "lastname1", "email1"); // Error found
//		User user = new User()
//				.setFirstname("firstname3")
//				//.setLastname("lastname3")
//				.setEmail("email3")
//				.setLogin("login3")
//				.setPassword("password3")
//				.setCommunity("community3")
//				.setCity("city3");
		//
		// 4. Add static factory
//		User user = User.get()
//				.setFirstname("firstname4")
//				//.setLastname("lastname4")
//				.setEmail("email4")
//				.setLogin("login4")
//				.setPassword("password4")
//				.setCommunity("community4")
//				.setCity("city4");
		//
		// 5. Add builder
//		User user = User.get()
//				.setFirstname("firstname5")
//				.setLastname("lastname5")
//				.setEmail("email5")
//				.setLogin("login5")
//				.setPassword("password5")
//				.setCommunity("community5")
//				.build();
		//
		// 5. Use setter as Error
		//System.out.println("login = " + user.setLogin(""));
		//
		// 6. Use dependency inversion
//		IUser user = User.get()
//				.setFirstname("firstname5")
//				.setLastname("lastname5")
//				.setEmail("email5")
//				.setLogin("login5")
//				.setPassword("password5")
//				.setCommunity("community5")
//				.build();
		//
		// 7. Add other setters
		IUser user = User.get()
				.setFirstname("firstname7")
				.setLastname("lastname7")
				.setEmail("email7")
				.setLogin("login7")
				.setPassword("password7")
				.setCommunity("community7")
				.setCity("city7")
				.build();
		//
		//System.out.println("login = " + user.setLogin("")); // Compile Error
		//((User)user).setLogin(""); // Worked
		System.out.println("login = " + user.getLogin());
	}
	
}
