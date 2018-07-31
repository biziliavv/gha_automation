package pageobjects;

import org.openqa.selenium.WebDriver;

import static setup.SeleniumDriver.getDriver;

public class BasePageObject {
    private WebDriver driver;


    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }


    String link = "http://admin:publish@gha.dev.conciliolabs.com/";
    public void openHomePage(){
        getDriver().get(link);

    }
}
