package com.objects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingInterCT {

	static WebDriver driver;

	public LandingInterCT(WebDriver driver) {
		this.driver = driver;
	}

	private static By tools = By.xpath("//a[normalize-space()='Tools']");
	private static By pgs = By.xpath("//img[@title='PGS']");

	private static By Hris = By.cssSelector("#ctl00_mnuList_rmMenu_m0");
	// driver.findElement(By.xpath("//span[text()='Employee Details']")).click();
	private static By EmpDetails = By.xpath("//span[text()='Employee Details']");
	private static By CentriCT = By.id("ctl00_ContentPlaceHolder1_lblWindowID1");

	private static By Travel = By.id("tdTravel");

	public void tools() {
		driver.findElement(tools).click();

	}

	public void pgsclick() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(pgs).click();
	}

	public void hrisclick() {
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}
		Actions act = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Hris));
		act.moveToElement(driver.findElement(Hris)).perform();
	}

	public void empDetails() {
		driver.findElement(EmpDetails).click();
	}

	public void CentriCT() {
		String CentriCts = driver.findElement(CentriCT).getText();
		System.out.println(CentriCts);
	}

	public void Travel() {
		driver.findElement(Travel).click();
	}
	/*
	 * WebElement e = driver.findElement(By.xpath("//span[text()='HRIS']")); // //
	 * WebElement e=driver.findElement(By.id("ctl00_mnuList_rmMenu_m0")); // Actions
	 * act = new Actions(driver); // act.moveToElement(e).perform();
	 */

}
