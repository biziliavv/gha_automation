package pageobjects;

import static setup.SeleniumDriver.getDriver;

public class HomePageObject extends BasePageObject {
    public HomePageObject(){
        super(getDriver());
    }
}
