package com.SeliniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask {
	static void Incognito() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://www.amazon.in/");

		String wndwHndl = d.getWindowHandle();
		System.out.println(wndwHndl);

		WebElement mobl = d.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
		Actions ac = new Actions(d);
		ac.contextClick(mobl).build().perform();

		Robot rob = new Robot();
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
	}

	public static void main(String[] args) throws Exception {
		Incognito();
	}

}
