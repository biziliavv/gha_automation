package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePageObject;
import setup.SeleniumBaseTest;

public class HomePageTests extends SeleniumBaseTest {

    @Test
    public void goToHomePage(){
        HomePageObject homePageObject = new HomePageObject();
        homePageObject.openHomePage();
        homePageObject.clickOnExclusiveOffers();
        Assert.assertEquals("FIND SPECIAL OFFERS", homePageObject.getExlusivePageTitle());
    }
}
