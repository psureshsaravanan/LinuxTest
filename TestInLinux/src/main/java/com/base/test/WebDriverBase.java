package com.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
public class WebDriverBase {

	public static void main(String[] args) {
		System.out.println("******************");
		System.out.println("-----ChromeDriver Execution starts----");
		System.out.println("System directory is -> "+System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"1chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");
WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.co.in");
		System.out.println("running--------");
		System.out.println("==========="+driver.getTitle()+"=======");
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
