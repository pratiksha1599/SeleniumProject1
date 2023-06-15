package com.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class UtilityClass {

	public static void screenshots(String Filename, WebDriver driver) {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file,
					new File("C:\\Users\\PratikshaP\\Desktop\\api_testing\\SeleniumProjectPOM1\\Screenshots\\"
							+ Filename + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
