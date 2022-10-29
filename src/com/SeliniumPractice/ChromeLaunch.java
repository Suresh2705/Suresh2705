package com.SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	static void LaunchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "T:\\\\GreensTechnology\\\\eclipse-workspace\\\\Java_Selinium\\\\Driver\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://web.skype.com/");
		d.getTitle();
		d.getCurrentUrl();

		//Navigate
		Thread.sleep(3000);
		d.navigate().to("https://web.telegram.org/");
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.navigate().forward();
		d.navigate().back();
// //tagname[@attributename='attributevalue']
// (//tagname[@attributename='attributevalue'])[indexvalue]
// //tagname[text()='fulltext']
// //tagname[contains(text(), 'halftext')]
// //tagname[contains(@attributename, 'attributevalue')]
		
	}
	
public static void main(String[] args) throws InterruptedException {
	LaunchBrowser();
}	

}


