package com.objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCountry {
	WebDriver driver;

	public DeleteCountry(WebDriver d) {

		driver = d;
		PageFactory.initElements(d, this);

	}

	@FindBy(xpath = ("//tr[@class=\"gridH\"]//following::img[@alt='Remove'][4]"))
	WebElement del;

	public void DeleteCountry1() throws InterruptedException {
		del.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}
}
