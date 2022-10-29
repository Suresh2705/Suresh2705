package com.SeliniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Alert {
	static void PopupAlert() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		w.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		w.switchTo().alert().accept();
		Thread.sleep(3000);
		
		w.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(8000);
		w.switchTo().alert().accept();
		Thread.sleep(3000);
		
		w.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(5000);
		w.switchTo().alert().dismiss();
		Thread.sleep(3000);

		w.findElement(By.id("promtButton")).click();
		Thread.sleep(8000);
		w.switchTo().alert().sendKeys("Tamizhan Suresh");
		Thread.sleep(2000);
		w.switchTo().alert().accept();
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot) w;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Screenshot\\Alert.png");
		FileUtils.copyFile(src, dst);
		
		w.quit();
	}
	public static void main(String[] args) throws Exception {
		PopupAlert();
	}

}
