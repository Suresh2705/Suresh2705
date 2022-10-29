package com.SeliniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinMiniProject {
	static void AdactinHotelRegister() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://adactinhotelapp.com/");

		dr.findElement(By.xpath("//a[contains(text(),'New')]")).click();
		Thread.sleep(3000);
		dr.findElement(By.name("username")).sendKeys("Suresh1501");
		dr.findElement(By.id("password")).sendKeys("Tamilan@123");
		dr.findElement(By.name("re_password")).sendKeys("Tamilan@123");
		dr.findElement(By.name("full_name")).sendKeys("Suresh Arumugam");
		dr.findElement(By.id("email_add")).sendKeys("tamizhansuresharumugam@gmail.com");
		Thread.sleep(3000);
		// Scanner sc = new Scanner(System.in);
		// String capcha = sc.nextLine();
		dr.findElement(By.id("ct-captcha")).sendKeys("provedor");
		dr.findElement(By.name("tnc_box")).click();
		Thread.sleep(3000);
		dr.findElement(By.name("Submit")).click();
	}

	static void AdactinHotelBooking() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://adactinhotelapp.com/");
		Thread.sleep(3000);

		dr.findElement(By.name("username")).sendKeys("Suresh1501");
		dr.findElement(By.id("password")).sendKeys("Tamilan@123");
		Thread.sleep(2000);
		dr.findElement(By.name("login")).click();
		Thread.sleep(3000);
		// Search Hotel
		WebElement loc = dr.findElement(By.name("location"));
		Select seloc = new Select(loc);
		seloc.selectByIndex(8);
		WebElement hotls = dr.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select sehot = new Select(hotls);
		sehot.selectByIndex(3);
		WebElement roomtpe = dr.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select rmtpe = new Select(roomtpe);
		rmtpe.selectByVisibleText("Deluxe");
		WebElement noofrooms = dr.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select rmnos = new Select(noofrooms);
		rmnos.selectByValue("2");
		dr.findElement(By.name("datepick_in")).clear();
		dr.findElement(By.name("datepick_in")).sendKeys("10/11/2022");
		dr.findElement(By.id("datepick_out")).clear();
		dr.findElement(By.id("datepick_out")).sendKeys("13/11/2022");
		WebElement adlts = dr.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select adlt = new Select(adlts);
		adlt.selectByValue("2");
		WebElement children = dr.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		Select child = new Select(children);
		child.selectByIndex(2);
		Thread.sleep(5000);
		dr.findElement(By.xpath("//input[@value='Search']")).click();
		//Continue
		dr.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(5000);
		dr.findElement(By.name("continue")).click();
		//Booking window
		dr.findElement(By.name("first_name")).sendKeys("Suresh");
		dr.findElement(By.id("last_name")).sendKeys("Arumugam");
		dr.findElement(By.name("address")).sendKeys("No. 11B, Lakshmanan Nagar East Street, Peravallur, Chennai - 82");
		dr.findElement(By.xpath("(//input[@class='reg_input'])[3]")).sendKeys("1234567890101112");
		WebElement creditcardtype = dr.findElement(By.xpath("//select[@class='select_combobox']"));
		Select cardtype = new Select(creditcardtype);
		cardtype.selectByIndex(2);
		WebElement selmonth = dr.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
		Select month = new Select(selmonth);
		month.selectByIndex(12);
		WebElement selyear = dr.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
		Select year = new Select(selyear);
		year.selectByVisibleText("2022");
		dr.findElement(By.xpath("(//input[@class='reg_input'])[4]")).sendKeys("067");
		Thread.sleep(5000);
		dr.findElement(By.name("book_now")).click();
		Thread.sleep(10000);
		//dr.findElement(By.name("my_itinerary")).click();
		dr.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		Thread.sleep(5000);
		//Booked page Screenshot
		TakesScreenshot bkdscrshot = (TakesScreenshot) dr;
		File bkdsrc = bkdscrshot.getScreenshotAs(OutputType.FILE);
		File bkdsrcdst = new File("T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Screenshot\\AdactinBooking.png");
		FileUtils.copyFile(bkdsrc, bkdsrcdst);
		Thread.sleep(5000);
		//Cancellation
		//dr.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		dr.findElement(By.id("check_all")).click();
		dr.findElement(By.name("cancelall")).click();
		Thread.sleep(5000);
		//Alert handling
		dr.switchTo().alert().accept();
		//Cancellation page Screenshot
		Thread.sleep(5000);
		TakesScreenshot scr = (TakesScreenshot) dr;
		File src = scr.getScreenshotAs(OutputType.FILE);
		File dst = new File("T:\\GreensTechnology\\eclipse-workspace\\Java_Selinium\\Screenshot\\AdactinCancellation.png");
		FileUtils.copyFile(src, dst);
		Thread.sleep(30000);
		dr.quit();
	}

	public static void main(String[] args) throws Exception {
		// AdactinHotelRegister();
		AdactinHotelBooking();
	}

}
