package com.softserve.edu.reg.data;

public final class UserRepository {

	// Use Singleton, Repository
	private static volatile UserRepository instance;

	private UserRepository() {
	}

	public static UserRepository get() {
		if (instance == null) {
			synchronized (UserRepository.class) {
				if (instance == null) {
					instance = new UserRepository();
				}
			}
		}
		return instance;
	}

	public IUser admin() {
		return User.get()
				.setFirstname("Адміністратор")
				.setLastname("Адміністратор")
				.setEmail("admin@admin.com")
				.setLogin("admin")
				.setPassword("admin")
				.setCommunity("Україна")
				.setCity("Львів")
				.build();
	}

	public IUser adminTest() {
		return User.get()
				.setFirstname("test")
				.setLastname("test")
				.setEmail("test@gmail.com")
				.setLogin("test")
				.setPassword("qwerty")
				.setCommunity("Україна")
				.build();
	}

	public IUser registrator() {
		return User.get()
				.setFirstname("реєстратор")
				.setLastname("реєстратор")
				.setEmail("registrator@ukr.net")
				.setLogin("registrator")
				.setPassword("admin")
				.setCommunity("Львівська")
				.build();
	}

	public IUser coowner() {
		return User.get()
				.setFirstname("петро")
				.setLastname("петренко")
				.setEmail("petr@ukr.net")
				.setLogin("petrenko")
				.setPassword("petrenko")
				.setCommunity("Львівська")
				.build();
	}

	public IUser invalidUser() {
		return User.get()
				.setFirstname("qwerty")
				.setLastname("qwerty")
				.setEmail("qwerty@ukr.net")
				.setLogin("qwerty")
				.setPassword("qwerty")
				.setCommunity("Україна")
				.build();
	}

	public IUser newUser() {
		return User.get()
				.setFirstname("ivan")
				.setLastname("ivan")
				.setEmail("ivan@ukr.net")
				.setLogin("ivan")
				.setPassword("qwerty")
				.setCommunity("Україна")
				.build();
	}

}
