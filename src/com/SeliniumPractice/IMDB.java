package com.SeliniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMDB {
	static void Jaibhim() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.ticketnew.com/");
		d.getTitle();
		d.getCurrentUrl();
		//Navigate
		d.navigate().to("https://www.imdb.com/");
		d.getTitle();
		d.getCurrentUrl();
		d.navigate().back();
		d.navigate().refresh();
		d.navigate().forward();
		//Locators
		d.findElement(By.xpath("//input[@placeholder='Search IMDb']")).sendKeys("Jaibhim");
		d.findElement(By.xpath("//button[@class='nav-search__search-submit searchform__submit']")).click();
		d.findElement(By.xpath("(//a[text()='Jai Bhim'])[1]")).click();
		//Screenshot
		TakesScreenshot t = (TakesScreenshot) d;//Narrowing typecasting
		File src = t.getScreenshotAs(OutputType.FILE);
		File dstn = new File("T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Screenshot\\Jaibhim.png");
		FileUtils.copyFile(src, dstn);
		Thread.sleep(8000);
		d.close();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		Jaibhim();
	}

}
