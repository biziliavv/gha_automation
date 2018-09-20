package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static setup.SeleniumDriver.getDriver;

public class HomePageObject extends BasePageObject {
    public HomePageObject(){
        super(getDriver());
    }


}
