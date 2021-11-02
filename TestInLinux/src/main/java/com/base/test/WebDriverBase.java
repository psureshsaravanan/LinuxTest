package com.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBase {

	public static void main(String[] args) {
		System.out.println("******************");
		System.out.println("-----ChromeDriver Execution starts----");
		System.out.println("System directory is -> "+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit(); 
		System.out.println("Execution success--------");
	}
}
