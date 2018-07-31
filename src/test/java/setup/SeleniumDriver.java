package setup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Selenium driver wrapper
 *
 * Created by vitaliybizilia on 2/23/17.
 */
public class SeleniumDriver {

	public static WebDriver driver;



	public static WebDriver getDriver(){
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE,false);
			driver = new ChromeDriver(options);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		return driver;
	}

}
