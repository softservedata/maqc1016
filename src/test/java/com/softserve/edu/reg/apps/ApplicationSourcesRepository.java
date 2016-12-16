package com.softserve.edu.reg.apps;

public final class ApplicationSourcesRepository {

	private ApplicationSourcesRepository() {
	}

	public static ApplicationSources getDefault() {
		return getChromeTraining();
	}

	public static ApplicationSources getFirefox4701Heroku() {
		return new ApplicationSources("FireFox.47.0.1", "", 5L,
				"http://registrator.herokuapp.com/login",
				"http://registrator.herokuapp.com/logout");
	}

	public static ApplicationSources getFirefox4701Training() {
		return new ApplicationSources("FireFox.47.0.1", "", 5L,
				"http://java.training.local:8080/registrator/login",
				"http://java.training.local:8080/registrator/logout");
	}

	public static ApplicationSources getFirefox5002Heroku() {
		// System.out.println("+++++ PATH = "
		// + ApplicationSourcesRepository.class.getResource("/lib/geckodriver.exe").getPath().substring(1));
		return new ApplicationSources("FireFox.50.0.2",
				ApplicationSourcesRepository.class.getResource("/lib/geckodriver.exe").getPath().substring(1), 5L,
				"http://registrator.herokuapp.com/login",
				"http://registrator.herokuapp.com/logout");
	}

	public static ApplicationSources getFirefox5002Training() {
		// System.out.println("+++++ PATH = "
		// + ApplicationSourcesRepository.class.getResource("/lib/geckodriver.exe").getPath().substring(1));
		return new ApplicationSources("FireFox.50.0.2",
				ApplicationSourcesRepository.class.getResource("/lib/geckodriver.exe").getPath().substring(1), 5L,
				"http://java.training.local:8080/registrator/login",
				"http://java.training.local:8080/registrator/logout");
	}

	public static ApplicationSources getChromeHeroku() {
		return new ApplicationSources("Chrome",
				// "C:\\Program Files
				// (x86)\\Google\\Chrome\\Application\\chromedriver.exe", 5L,
				ApplicationSourcesRepository.class.getResource("/lib/chromedriver.exe").getPath().substring(1), 5L,
				"http://registrator.herokuapp.com/login",
				"http://registrator.herokuapp.com/logout");
	}

	public static ApplicationSources getChromeTraining() {
		return new ApplicationSources("Chrome",
				// "C:\\Program Files
				// (x86)\\Google\\Chrome\\Application\\chromedriver.exe", 5L,
				ApplicationSourcesRepository.class.getResource("/lib/chromedriver.exe").getPath().substring(1), 5L,
				"http://java.training.local:8080/registrator/login",
				"http://java.training.local:8080/registrator/logout");
	}

	public static ApplicationSources getHtmlUnitHeroku() {
		return new ApplicationSources("HtmlUnit", "", 5L,
				"http://registrator.herokuapp.com/login",
				"http://registrator.herokuapp.com/logout");
	}

	public static ApplicationSources getHtmlUnitTraining() {
		return new ApplicationSources("HtmlUnit", "", 5L,
				"http://java.training.local:8080/registrator/login",
				"http://java.training.local:8080/registrator/logout");
	}

}