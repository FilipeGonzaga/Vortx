package tests.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import test.core.DriverFactory;


public class Captures {
	
	public void screenshot(String titulo) {
		File scrFile = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(scrFile, new File("target/screenshot/"+ titulo +".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
