package com.SeliniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {
	static void Signup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://www.facebook.com/");
		drv.findElement(By.name("email")).sendKeys("Suresh A");
		drv.findElement(By.id("pass")).sendKeys("9942424067");
		drv.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(3000);
		drv.navigate().back();
		drv.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		drv.findElement(By.name("firstname")).sendKeys("Suresh");
		drv.findElement(By.name("lastname")).sendKeys("Arumugam");
		drv.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("987654321");
		drv.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Welcome@12345");
		// Dropdown
		WebElement day = drv.findElement(By.id("day"));
		Select sl = new Select(day);
		sl.selectByValue("8");
		WebElement mnth = drv.findElement(By.name("birthday_month"));
		Select sl1 = new Select(mnth);
		sl1.selectByVisibleText("Jun");
		WebElement yr = drv.findElement(By.name("birthday_year"));
		Select sl2 = new Select(yr);
		sl2.selectByVisibleText("1990");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//label[text()='Male']")).click();
		drv.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		TakesScreenshot scr = (TakesScreenshot) drv;
		File srce = scr.getScreenshotAs(OutputType.FILE);
		File dst = new File("T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Screenshot\\FbSignupTask.png");
		FileUtils.copyFile(srce, dst);
	}

	public static void main(String[] args) throws Exception {
		Signup();
	}

}
// //tagname[@attributename='attributevalue']
// (//tagname[@attributename='attributevalue'])[indexvalue]
// //tagname[text()='fulltext']
// //tagname[contains(text(), 'halftext')]
// //tagname[contains(@attributename, 'attributevalue')]
