package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumBasics\\utilities\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.getTitle();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello Java");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//div[@id=\"result-stats\"]")).getText());
		driver.close();
	}

}
