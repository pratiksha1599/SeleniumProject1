package com.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Util.UtilityClass;

public class AddCountries2 {

	WebDriver driver;

	public AddCountries2(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}

	@FindBy(name = ("ctl00$ContentPlaceHolder1$cboTravelCountry"))
	WebElement drpCountry;

	// =driver.findElement(By.name("ctl00$ContentPlaceHolder1$cboTravelCountry"))
	

	@FindBy(name = ("ctl00$ContentPlaceHolder1$cboTravelNoOfTrips"))
	WebElement noofTrips;

	@FindBy(id = ("txtTravelRemarks"))
	WebElement Remarks;

	@FindBy(name = ("ctl00$ContentPlaceHolder1$cboTypeOfTravel"))
	WebElement typeofTravel;

	@FindBy(name = ("ctl00$ContentPlaceHolder1$cboTravelEstDuration"))
	WebElement TotalEstDuration;

	@FindBy(id = "btnTravelAdd")
	WebElement Addbtn;

	public void AddCountry() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Select drpCountry1 = new Select(drpCountry);
		drpCountry1.selectByVisibleText("Brazil");

		Select noofTrips1 = new Select(noofTrips);
		noofTrips1.selectByValue("1-2");;

		Select typeofTravel1 = new Select(typeofTravel);
		typeofTravel1.selectByIndex(5);

		Select TotalEstDuration1 = new Select(TotalEstDuration);
		TotalEstDuration1.selectByIndex(2);

		Remarks.sendKeys("Brazil");
		Addbtn.click();

	}

	public void AddCountry1() throws InterruptedException {
		Thread.sleep(3000);
		Select drpCountry2 = new Select(drpCountry);
		drpCountry2.selectByVisibleText("Dubai");

		Select noofTrips2 = new Select(noofTrips);
		noofTrips2.selectByIndex(1);

		Select typeofTravel2 = new Select(typeofTravel);
		typeofTravel2.selectByIndex(6);

		Select TotalEstDuration2 = new Select(TotalEstDuration);
		TotalEstDuration2.selectByIndex(2);

		Remarks.sendKeys("Dubai");
		Addbtn.click();

	}

	public void AddCountry2() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select drpCountry3 = new Select(drpCountry);
		drpCountry3.selectByVisibleText("Denmark");

		Select noofTrips3 = new Select(noofTrips);
		noofTrips3.selectByIndex(2);

		Select typeofTravel3 = new Select(typeofTravel);
		typeofTravel3.selectByIndex(7);

		Select TotalEstDuration3 = new Select(TotalEstDuration);
		TotalEstDuration3.selectByIndex(2);
		Remarks.sendKeys("Denmark");
		Addbtn.click();

	}

	public void AddCountry3() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select drpCountry4 = new Select(drpCountry);
		drpCountry4.selectByVisibleText("Iceland");

		Select noofTrips4 = new Select(noofTrips);
		noofTrips4.selectByIndex(1);

		Select typeofTravel4 = new Select(typeofTravel);
		typeofTravel4.selectByIndex(2);

		Select TotalEstDuration4 = new Select(TotalEstDuration);
		TotalEstDuration4.selectByIndex(2);

		Remarks.sendKeys("Iceland");
		Addbtn.click();

		
		driver.findElement(By.xpath(""));
	}
}

