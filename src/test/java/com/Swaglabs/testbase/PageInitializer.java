package com.Swaglabs.testbase;



import com.Swaglabs.pages.LoginPage;
import com.Swaglabs.pages.MainPage;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;
	public static MainPage mainPage;
	


	public static void initialize() {
		// initialize pages
		loginPage = new LoginPage();
		mainPage = new MainPage();
	}

}
