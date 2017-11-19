package step_Definitions;

import cucumberBaseUtil.WebDriverHolder;
import com.avenuecode.todoAppPages.ToDoAppUserHomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ToDoAppCreateSubTaskStepDefinitions extends WebDriverHolder {
    private WebDriverHolder driver;
    private ToDoAppUserHomePage toDoAppUserHomePage;

    public ToDoAppCreateSubTaskStepDefinitions(WebDriverHolder driver) {
         this.driver = driver;
    }

    @Then("^I should be able to see button labeled as �Manage Subtasks� on the table of created tasks\\.$")
    public void i_should_be_able_to_see_button_labeled_as_Manage_Subtasks_on_the_table_of_created_tasks() throws Throwable {
        String taskname="task"+ToDoAppUserHomePage.generateCurrentDateTime();
        toDoAppUserHomePage.addTask(taskname);
        toDoAppUserHomePage.getTask(taskname);
        assertTrue(toDoAppUserHomePage.buttonManageTasks.get(toDoAppUserHomePage.taskindex).isDisplayed(), "The Manage Subtasks button is displayed in the tasks list");
        toDoAppUserHomePage.signout();

    }

    @When("^I click on Manage Subtask button$")
    public void i_click_on_Manage_Subtask_button() throws Throwable {

    }

    @When("^click on Add button in the modal dialog$")
    public void click_on_Add_button_in_the_modal_dialog() throws Throwable {

    }

    @Then("^A new subtask should not be created$")
    public void a_new_subtask_should_not_be_created() throws Throwable {

    }

    @When("^create a new subtask$")
    public void create_a_new_subtask() throws Throwable {

    }

    @Then("^the new subtask should be appended to the subtasks list in the modal dialog$")
    public void the_new_subtask_should_be_appended_to_the_subtasks_list_in_the_modal_dialog() throws Throwable {

    }





}
