package com.SeliniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSelinium {
	static void fndelemnts() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");

		d.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles under 10k");
		Thread.sleep(2000);

		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		
		List<WebElement> phones = d.findElements(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
		for (WebElement single : phones) {
			System.out.println(single.getText());
		}
		Thread.sleep(3000);
		d.quit();
	}

	public static void main(String[] args) throws Exception {
		fndelemnts();
	}

}
//https://adactinhotelapp.com/

//Java class in selinium
//Interface 
//Class
//Web driver methods
//Web element methods
//
//return type for findelement and elements