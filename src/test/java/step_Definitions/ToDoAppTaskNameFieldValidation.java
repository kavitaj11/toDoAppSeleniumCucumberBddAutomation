package step_Definitions;

import com.avenuecode.todoAppPages.ToDoAppUserHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberBaseUtil.WebDriverHolder;
import org.openqa.selenium.By;

import java.util.logging.Logger;

import static com.avenuecode.todoAppPages.BaseTestPage.waitForPresenceOfTheElement;

public class ToDoAppTaskNameFieldValidation {
    private WebDriverHolder driver;
    private static final Logger LOGGER = Logger.getLogger(ToDoAppViewCreatedTaskStepDefinition.class.getName());
    private ToDoAppUserHomePage toDoAppUserHomePage;

    public ToDoAppTaskNameFieldValidation(WebDriverHolder driver)
    {
        this.driver=driver;
    }


    @When("^I input invalid task name \"(.*)\"  in the task name field$")
    public void i_input_invalid_task_name_in_the_task_name_field(String taskname) throws Throwable {
        LOGGER.info( "Entering a valid task name in the task name field" );
        waitForPresenceOfTheElement(By.id("new_task"));
        toDoAppUserHomePage.textBoxAdd.sendKeys("abc");

    }


    @Then("^new task is not created$")
    public void new_task_is_not_created() throws Throwable {

    }

    @Given("^I navigate to ToDoApp home page$")
    public void iNavigateToToDoAppHomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I input invalid task name <taskname> in the task name field$")
    public void iInputInvalidTaskNameTasknameInTheTaskNameField() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^click the Add Task Button$")
    public void clickTheAddTaskButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
