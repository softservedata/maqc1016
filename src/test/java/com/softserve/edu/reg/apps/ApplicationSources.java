package com.softserve.edu.reg.apps;

interface IBrowserName {
	IDriverPath setBrowserName(String browserName);
}

interface IDriverPath {
	IImplicitTimeOut setDriverPath(String driverPath);
}

interface IImplicitTimeOut {
	ILoginUrl setImplicitTimeOut(long implicitTimeOut);
}

interface ILoginUrl {
	ILogoutUrl setLoginUrl(String loginUrl);
}

interface ILogoutUrl {
	IBuild setLogoutUrl(String logoutUrl);
}

interface IBuild {
	IApplicationSources build();
}

public class ApplicationSources implements IBrowserName, IDriverPath, IImplicitTimeOut, 
				ILoginUrl, ILogoutUrl, IBuild, IApplicationSources  {

	// Browser Data
	private String browserName;
	private String driverPath;
	// private String browserPath;
	// private String defaulProfile;
	//
	// Implicit and Explicit Waits
	private long implicitTimeOut;
	// private long explicitTimeOut;
	//
	// Localization Strategy
	// private String language;
	//
	// Search Strategy
	// private String searchStrategy;
	//
	// Logger Strategy
	// private String loggerStrategy;
	//
	// URLs
	private String loginUrl;
	private String logoutUrl;
	// private String serverUrl;
	//

	private ApplicationSources() {		
	}

	// static factory
	
	public static IBrowserName get() {
		return new ApplicationSources();
	}
	
	// setters
	
	public IDriverPath setBrowserName(String browserName) {
		this.browserName = browserName;
		return this;
	}

	public IImplicitTimeOut setDriverPath(String driverPath) {
		this.driverPath = driverPath;
		return this;
	}

	public ILoginUrl setImplicitTimeOut(long implicitTimeOut) {
		this.implicitTimeOut = implicitTimeOut;
		return this;
	}

	public ILogoutUrl setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
		return this;
	}

	public IBuild setLogoutUrl(String logoutUrl) {
		this.logoutUrl = logoutUrl;
		return this;
	}
	
	public IApplicationSources build() {
		return this;
	}
	
	// getters
	
	public String getBrowserName() {
		return browserName;
	}

	public String getDriverPath() {
		return driverPath;
	}

	public long getImplicitTimeOut() {
		return implicitTimeOut;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public String getLogoutUrl() {
		return logoutUrl;
	}

}
