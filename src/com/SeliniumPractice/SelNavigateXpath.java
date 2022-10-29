package com.SeliniumPractice;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.thread.ThreadPool.SizedThreadPool;

public class SelNavigateXpath {
	static void navigate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "T:\\\\\\\\GreensTechnology\\\\\\\\eclipse-workspace\\\\\\\\Java_Selinium\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.myntra.com/");
		
		String s = c.getTitle();
		System.out.println(s);
		
		String s1 = c.getCurrentUrl();
		System.out.println(s1);
		//Navigate
		c.navigate().to("https://www.meesho.com/");
		c.navigate().back();
		Thread.sleep(4000);
		c.navigate().refresh();
		c.navigate().forward();
	}
	static void xpath() {
		System.setProperty("webdriver.chrome.driver", "T:\\\\\\\\\\\\\\\\GreensTechnology\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Java_Selinium\\\\\\\\\\\\\\\\Driver\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		//Xpath - Atribute name and value
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//d.findElement(By.xpath("(//span[@class='_2I9KP_'])[2]")).click();
		d.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Mobiles under 10k");
		d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		//navigate();
		xpath();
	}

}
