package com.SeliniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesTask {
	static void frames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.automationtesting.in/Register.html");
		//dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement swtch = dr.findElement(By.xpath("//a[text()='SwitchTo']"));
		Select s = new Select(swtch);
		
		s.selectByVisibleText("Frames");
		
		
		
		

	}
	
	public static void main(String[] args) throws Exception {
		frames();
	}

}
