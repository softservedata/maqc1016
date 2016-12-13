package com.softserve.edu.reg.apps;

public interface IApplicationSources {

	String getBrowserName();

	String getDriverPath();

	long getImplicitTimeOut();

	String getLoginUrl();

	String getLogoutUrl();

}