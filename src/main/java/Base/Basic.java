package Base;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic {

	public static WebDriver driver;
	public static Properties prop;

	static {

		try {
			FileInputStream file = new FileInputStream("TestData/data.properties");
			prop = new Properties();
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void Explicit_Wait_by_Display_Element(WebElement ele, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void Screenshot() {
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File src = ss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("ScreenShots/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
