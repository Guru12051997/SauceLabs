
package com.qa.base;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCart extends BaseClass {
	@Test(priority = 1)
	public void dologin() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("gurupdas11@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Guru1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Test(priority = 2)
	public void checkPageTitle() {
		dologin();
		String title = driver.getTitle();
		System.out.println("---------" + title + "----------");
		AssertJUnit.assertEquals(title, "My Account");
	}

}
