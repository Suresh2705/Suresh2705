package com.SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	static void browserLaunch() {

		//Illegal state exception(entire property)   or T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exeSession not created Exception (Path)
		System.setProperty("webdriver.chrome.driver", "T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//up casting
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		WebElement login = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		login.sendKeys("Tamizhan Suresh");

		driver.findElement(By.name("login")).click();
	}

	static void XPAth() {
		System.setProperty("webdriver.chrome.driver", "T:\\\\GreensTechnology\\\\eclipse-workspace\\\\Java_Selinium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//up casting
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
      driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]")).click();
	}
	
	public static void main(String[] args) {
		browserLaunch();
		XPAth();
	}
}
