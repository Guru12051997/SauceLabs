package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTestNG {
	WebDriver driver;

	@Parameters({ "browser" })
	@Test
	public void LaunchUrl(String browserName) throws InterruptedException {
		System.out.println("browser name is : " + browserName);
		// String methodName = name.getName();

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			// WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/account");
		
		Thread.sleep(3000);
		driver.close();

	}

}
