package com.softserve.edu.reg.apps;

public final class ApplicationSourcesRepository {

	// Use Singleton, Repository
	private static volatile ApplicationSourcesRepository instance;

	private ApplicationSourcesRepository() {
	}

	public static ApplicationSourcesRepository get() {
		if (instance == null) {
			synchronized (ApplicationSourcesRepository.class) {
				if (instance == null) {
					instance = new ApplicationSourcesRepository();
				}
			}
		}
		return instance;
	}
	
	public IApplicationSources defaultConfig() {
		return ChromeHeroku();
	}
	
	public IApplicationSources Firefox4701Heroku() {
		return ApplicationSources.get()
				.setBrowserName("FireFox.47.0.1")
				.setDriverPath("")
				.setImplicitTimeOut(5L)
				.setLoginUrl("http://registrator.herokuapp.com/login")
				.setLogoutUrl("http://registrator.herokuapp.com/logout")
				.build();
	}
	
	public IApplicationSources Firefox4701Training() {
		return ApplicationSources.get()
				.setBrowserName("FireFox.47.0.1")
				.setDriverPath("")
				.setImplicitTimeOut(5L)
				.setLoginUrl("http://java.training.local:8080/registrator/login")
				.setLogoutUrl("http://java.training.local:8080/registrator/logout")
				.build();
	}
	
	public IApplicationSources FirefoxHeroku() {
		return ApplicationSources.get()
				.setBrowserName("FireFox.3.0.1")
				.setDriverPath(ApplicationSourcesRepository.class.getResource("/lib/geckodriver.exe").getPath().substring(1))
				.setImplicitTimeOut(5L)
				.setLoginUrl("http://registrator.herokuapp.com/login")
				.setLogoutUrl("http://registrator.herokuapp.com/logout")
				.build();
	}

	public IApplicationSources FirefoxTraining() {
		return ApplicationSources.get()
				.setBrowserName("FireFox.3.0.1")
				.setDriverPath(ApplicationSourcesRepository.class.getResource("/lib/geckodriver.exe").getPath().substring(1))
				.setImplicitTimeOut(5L)
				.setLoginUrl("http://java.training.local:8080/registrator/login")
				.setLogoutUrl("http://java.training.local:8080/registrator/logout")
				.build();
	}

	public IApplicationSources ChromeHeroku() {
		return ApplicationSources.get()
				.setBrowserName("Chrome")
				.setDriverPath(ApplicationSourcesRepository.class.getResource("/lib/chromedriver.exe").getPath().substring(1))
				.setImplicitTimeOut(5L)
				.setLoginUrl("http://registrator.herokuapp.com/login")
				.setLogoutUrl("http://registrator.herokuapp.com/logout")
				.build();
	}

	public IApplicationSources ChromeTraining() {
		return ApplicationSources.get()
				.setBrowserName("Chrome")
				.setDriverPath(ApplicationSourcesRepository.class.getResource("/lib/chromedriver.exe").getPath().substring(1))
				.setImplicitTimeOut(5L)
				.setLoginUrl("http://java.training.local:8080/registrator/login")
				.setLogoutUrl("http://java.training.local:8080/registrator/logout")
				.build();
	}

	public IApplicationSources HtmlUnitHeroku() {
		return ApplicationSources.get()
				.setBrowserName("HtmlUnit")
				.setDriverPath("")
				.setImplicitTimeOut(5L)
				.setLoginUrl("http://registrator.herokuapp.com/login")
				.setLogoutUrl("http://registrator.herokuapp.com/logout")
				.build();
	}
	
	public IApplicationSources HtmlUnitTraining() {
		return ApplicationSources.get()
				.setBrowserName("HtmlUnit")
				.setDriverPath("")
				.setImplicitTimeOut(5L)
				.setLoginUrl("http://java.training.local:8080/registrator/login")
				.setLogoutUrl("http://java.training.local:8080/registrator/logout")
				.build();
	}

}