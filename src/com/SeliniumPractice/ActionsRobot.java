package com.SeliniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRobot {
	static void actions_Robot() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String homewindow = driver.getWindowHandle();
		System.out.println(homewindow);
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//Actions -->class Mouse handling
		Actions act = new Actions(driver);
		act.contextClick(mobile).build().perform();
		
		//Keyboar controls
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);		
		WebElement book = driver.findElement(By.xpath("//a[text()='Books']"));
		act.contextClick(book).build().perform();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		
		Set<String> Totalwindows = driver.getWindowHandles();
		
		String a ="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		for (String string : Totalwindows) {
			if(driver.switchTo().window(string).getTitle().equals(a)){
				driver.close();
			}
			
		}
	}
	public static void main(String[] args) throws Exception{
		actions_Robot();	
	}
}
