package step_Definitions;

import cucumberBaseUtil.WebDriverHolder;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends WebDriverHolder {

    private WebDriverHolder driver;

    public Hook(WebDriverHolder driver) {
        this.driver = driver;
    }

   //This method will run before Background and Scenario
    @Before
    public void testInitializer(){
        WebDriverHolder.initWebDriver();
    }

    //This method will at the end of each Scenario
    @After
    public void tearDownTest(){
        WebDriverHolder.getDriver().close();
    }
}
