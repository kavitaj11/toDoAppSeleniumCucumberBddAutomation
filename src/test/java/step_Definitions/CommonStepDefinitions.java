package step_Definitions;

import commonUtil.configFileReader;
import cucumberBaseUtil.WebDriverHolder;
import com.avenuecode.todoAppPages.ToDoAppPublicPage;
import com.avenuecode.todoAppPages.ToDoAppSignInPage;
import com.avenuecode.todoAppPages.ToDoAppUserHomePage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import static com.avenuecode.todoAppPages.BaseTestPage.waitForPresenceOfTheElement;

public class CommonStepDefinitions extends WebDriverHolder {
    private WebDriverHolder driver;
    public String baseurl;
    public String email;
    public String password;
    private static final Logger LOGGER = Logger.getLogger(ToDoAppViewCreatedTaskStepDefinition.class.getName());

    public CommonStepDefinitions(WebDriverHolder driver){
        this.driver=driver;
    }
    private ToDoAppUserHomePage toDoAppUserHomePage;

    @Given("^I navigate to home page$")
    public void i_navigate_to_home_page() {
        configFileReader config = new configFileReader();

        baseurl=config.getProperty("baseurl");
        email=config.getProperty("email");
        password=config.getProperty("password");

        LOGGER.info( "Navigating to avenuecode ToDoApp website and Signing In to user homepage" );
        getDriver().navigate().to(baseurl);
        getDriver().manage().window().maximize();

        ToDoAppPublicPage toDoAppPublicPage= new ToDoAppPublicPage(getDriver());
        waitForPresenceOfTheElement(By.linkText("Sign In"));
        toDoAppPublicPage.linkSignIn.click();

        ToDoAppSignInPage toDoAppSignIn =new ToDoAppSignInPage(getDriver());
        toDoAppSignIn.signIn(email,password);
        toDoAppUserHomePage =new ToDoAppUserHomePage(getDriver());

    }
    @Given("^I click on the My Tasks Link$")
    public void i_click_on_the_My_Tasks_Link() throws Throwable {
        LOGGER.info( "Clicking on My Task link" );
        toDoAppUserHomePage.linkMyTasks.click();
    }
}
