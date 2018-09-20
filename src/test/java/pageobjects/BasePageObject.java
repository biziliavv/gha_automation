package pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
    public void clickOnExclusiveOffers(){
        WebElement specialOffers = getDriver().findElement(By.xpath("//a[text()='Special Offers']"));
        specialOffers.click();
    }
    public String getExlusivePageTitle(){
        fluentWaitforElement(getDriver().findElement(By.xpath("//h3[@class='SpecialOffersTitle SpecialOffersTitle--posTop SpecialOffersTitle--dark']")), 50, 3);
        return getDriver().findElement(By.xpath("//h3[@class='SpecialOffersTitle SpecialOffersTitle--posTop SpecialOffersTitle--dark']")).getText();
    }
    // Custom wait method for waiting until element is visible
    public WebElement fluentWaitforElement(WebElement element, int timoutSec, int pollingSec) {

        FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(timoutSec, TimeUnit.SECONDS)
                .pollingEvery(pollingSec, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, TimeoutException.class).ignoring(StaleElementReferenceException.class);

        for (int i = 0; i < 2; i++) {
            try {
                fWait.until(ExpectedConditions.visibilityOf(element));
                fWait.until(ExpectedConditions.elementToBeClickable(element));
            } catch (Exception e) {

                System.out.println("Element Not found trying again - " + element.toString().substring(70));
                e.printStackTrace();

            }
        }

        return element;

    }
}
