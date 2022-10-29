package com.SeliniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	static void flipkart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");

		d.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(5000);

		d.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobiles under 10k");
		Thread.sleep(5000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		List<WebElement> phones = d.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(10000);
		for (WebElement single : phones) {
			System.out.println(single.getText());
		}
		Thread.sleep(10000);
		d.quit();

	}

	public static void main(String[] args) throws Exception {
		flipkart();

	}

}
