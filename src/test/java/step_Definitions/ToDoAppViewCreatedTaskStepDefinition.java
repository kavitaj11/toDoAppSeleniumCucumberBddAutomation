package step_Definitions;

import cucumberBaseUtil.WebDriverHolder;
import com.avenuecode.todoAppPages.ToDoAppUserHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Logger;

import static com.avenuecode.todoAppPages.BaseTestPage.waitForPresenceOfTheElement;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ToDoAppViewCreatedTaskStepDefinition extends WebDriverHolder {
	private WebDriverHolder driver;
	private static final Logger LOGGER = Logger.getLogger(ToDoAppViewCreatedTaskStepDefinition.class.getName());

	public ToDoAppViewCreatedTaskStepDefinition(WebDriverHolder driver){
		this.driver=driver;
	}

	String userFirstName= "kavita";
	private ToDoAppUserHomePage toDoAppUserHomePage;

	@Then("^I should be able to view all created tasks$")
	public void i_should_be_able_to_view_all_created_tasks() throws Throwable {
		List<WebElement> allRows= getDriver().findElements(By.xpath("//table[@class='table']/tbody/tr"));
		System.out.println("Total data rows found in table:"+ (allRows.size()-1));
		//toDoAppUserHomePage.signout();
	}

	@Then("^I should see a message on the top part saying that the tasks list belongs to the logged user$")
	public void i_should_see_a_message_on_the_top_part_saying_that_the_tasks_list_belongs_to_the_logged_user() throws Throwable {
		String headerMessage= toDoAppUserHomePage.headerMessageToDoApp.getText();
		String expectedHeaderMessage= "Hey "+userFirstName+", this is your todo list for today";
		assertEquals(headerMessage,expectedHeaderMessage);
		toDoAppUserHomePage.signout();
	}

	@Given("^I input valid task name abc in the task name field$")
	public void i_input_valid_task_name_abc_in_the_task_name_field() throws Throwable {
		LOGGER.info( "Entering a valid task name in the task name field" );
		waitForPresenceOfTheElement(By.id("new_task"));
		toDoAppUserHomePage.textBoxAdd.sendKeys("abc");
	}
	
	@When("^I click the Add Task Button$")
	public void i_click_the_Add_Task_Button() throws Throwable {
		LOGGER.info( "Clicking Add Task button" );
		toDoAppUserHomePage.buttonAdd.click();
	}
	
	@Then("^I should be able to see new task created in the tasks list$")
	public void i_should_be_able_to_see_new_task_created_in_the_tasks_list() throws Throwable {
		LOGGER.info( "Verifying new task is created in the tasks list" );
		toDoAppUserHomePage.getTask("abc");
		toDoAppUserHomePage.signout();
	}
	
	
		

	@Then("^I should see the new task appended to the created tasks list$")
	public void i_should_see_the_new_task_appended_to_the_created_tasks_list() throws Throwable {
		//Getting the last row value of the tasks table
		toDoAppUserHomePage.addTask("testing");
		LOGGER.info("printing column values of last row of table: ");
		List<WebElement> columnOfLastRow= getDriver().findElements(By.xpath("//table[@class='table']/tbody/tr[last()]/td"));
		boolean taskAppended=false;
		for(WebElement e:columnOfLastRow)
		{
			System.out.println(e.getText());
			if(e.getText().contains("testing")) {
				taskAppended=true;
			}

		}
		assertTrue(taskAppended, "The new task is appended to the created tasks list as expected");
		toDoAppUserHomePage.signout();
		
	}



}
