package setup;

import org.testng.annotations.AfterTest;

import static setup.SeleniumDriver.getDriver;

/**
 * SeleniumBaseTest
 *
 * Created by vitaliybizilia on 2/23/17.
 */
public class SeleniumBaseTest {

    @AfterTest
    public static void tearDown() {
        getDriver().quit();
    }



}





