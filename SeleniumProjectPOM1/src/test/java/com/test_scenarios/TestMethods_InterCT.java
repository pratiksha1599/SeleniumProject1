package com.test_scenarios;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Util.UtilityClass;

import com.objects.AddCountries2;
import com.objects.DeleteCountry;
import com.objects.LandingInterCT;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_InterCT {
	WebDriver driver;

	@Test(priority = 1)
	public void beforetest() {
		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://onlinect.sharepoint.com/sites/interct/Pages/Home.aspx");
		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	public void ToolsOpration() throws InterruptedException {

		LandingInterCT ct = new LandingInterCT(driver);

		ct.tools();
		ct.pgsclick();
		Thread.sleep(5000);
		ct.hrisclick();
		ct.empDetails();
		ct.CentriCT();
		ct.Travel();
	}

	@Test(priority = 3)
	public void AddOperation() throws InterruptedException {
		AddCountries2 ad = new AddCountries2(driver);
		ad.AddCountry();
		Thread.sleep(5000);
		ad.AddCountry1();
		Thread.sleep(5000);

		ad.AddCountry2();
		Thread.sleep(5000);
		ad.AddCountry3();

		// Thread.sleep(5000);

	}

	@Test(priority = 4)
	public void AddCountryScreenshot() throws InterruptedException {
		Thread.sleep(5000);
		UtilityClass.screenshots("AddCountry_Screenshot_13", driver);

	}

	@Test(priority = 5)
	public void DeleteCountryoperation() throws InterruptedException {
		DeleteCountry d1 = new DeleteCountry(driver);
		d1.DeleteCountry1();

		Thread.sleep(5000);
	}

	@Test(priority = 6)
	public void AddDeleteCountry() {

		UtilityClass.screenshots("DeleteCountry_Screenshot_13", driver);

	}
}