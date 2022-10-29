package com.SeliniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultDropdown {
	static void MulDropDn() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://letcode.in/dropdowns");
		
		WebElement frts = w.findElement(By.id("fruits"));
		Select s1 = new Select(frts);
		s1.selectByIndex(2);
		
		WebElement sprheros = w.findElement(By.xpath("//select[@id='superheros']"));
		Select s2 = new Select(sprheros);
		s2.selectByValue("am");
		s2.selectByIndex(1);
		s2.selectByVisibleText("The Avengers");
		s2.selectByIndex(3);
		Thread.sleep(5000);
		s2.deselectByVisibleText("The Avengers");
		
		WebElement language = w.findElement(By.id("lang"));
		Select lang = new Select(language);
		lang.selectByValue("py");
		
		List<WebElement> optns = lang.getOptions();
		for (WebElement optn : optns) {
			System.out.println(optn.getText());
		}
		
	}
	public static void main(String[] args) throws Exception {
		MulDropDn();
	}

}
