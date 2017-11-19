package com.avenuecode.toDoAppTestAutomation;
import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.avenuecode.todoAppPages.ToDoAppUserHomePage;

public class  ToDoAppTests extends BaseTestCase {
	
	//Test case for viewing list of created tasks
	@Test (priority = 1)
    public void test_viewCreatedTasksList(){
    	ToDoAppUserHomePage toDoAppUserHome =new ToDoAppUserHomePage(driver);
	    toDoAppUserHome.launchPage();
	    toDoAppUserHome.linkMyTasks.click();
	    List<WebElement> allRows1= driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		int numberOfCreatedTasks = allRows1.size()-1;
	    System.out.println("Total data rows found in table:"+ numberOfCreatedTasks );
	    if(numberOfCreatedTasks==0) {
	    toDoAppUserHome.addTask("testing");
	    List<WebElement> allRows2= driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		numberOfCreatedTasks = allRows2.size()-1;
	    System.out.println("Total data rows found in table:"+ numberOfCreatedTasks);
	    assertFalse((numberOfCreatedTasks==0) ,"Expected task list found");
	    }
	    assertTrue((!(numberOfCreatedTasks==0)) ,"Expected task list found");
		toDoAppUserHome.signout();
	
	}
   //Test case for verifying header message
	@Test (priority = 8)
	public void test_verifyHeaderMessage()  {
	
	    ToDoAppUserHomePage toDoAppUserHome =new ToDoAppUserHomePage(driver);
    	toDoAppUserHome.launchPage();
    	System.out.println(toDoAppUserHome.textWelcomeUser.getText());
	    assertEquals(toDoAppUserHome.textWelcomeUser.getText(),"Hey\n" + 
	    		"Kavita, this is your todo list for today:");
	    toDoAppUserHome.signout();
	
	
}
	//test case for adding task in the Todo list
	@Test (priority = 3)
	public void test_addTask()  {
	
	    ToDoAppUserHomePage toDoAppUserHome =new ToDoAppUserHomePage(driver);
	    toDoAppUserHome.launchPage();
    	//creating a unique task name each run
	    String taskname="task"+ToDoAppUserHomePage.generateCurrentDateTime();
	
	    //adding task
	    toDoAppUserHome.addTask(taskname);
	    int n=toDoAppUserHome.getTask(taskname);
	    System.out.println(n);
	    String listname =toDoAppUserHome.linkToDo.get(n).getText();
    	assertEquals(listname,taskname);
	    toDoAppUserHome.signout();
	}
	
	//test case for verifying Manage Subtasks button
	@Test (priority = 4)
	public void test_verifyManageSubTaskButton()  {
		 
	    ToDoAppUserHomePage toDoAppUserHome =new ToDoAppUserHomePage(driver);
	    toDoAppUserHome.launchPage();
	    String taskname="task"+ToDoAppUserHomePage.generateCurrentDateTime();
	    toDoAppUserHome.addTask(taskname);
    	toDoAppUserHome.getTask(taskname);
        assertTrue(toDoAppUserHome.buttonManageTasks.get(toDoAppUserHome.taskindex).isDisplayed(), "The Manage Subtasks button is displayed in the tasks list");
		toDoAppUserHome.signout();
	}
	
	
	//test case for adding subtask for a task
	@Test (priority = 5)
	public void test_addSubTask()  {
		 
	    ToDoAppUserHomePage toDoAppUserHome =new ToDoAppUserHomePage(driver);
	    toDoAppUserHome.launchPage();
	    String taskname="task"+ToDoAppUserHomePage.generateCurrentDateTime();
	    toDoAppUserHome.addTask(taskname);
    	toDoAppUserHome.getTask(taskname);
	    toDoAppUserHome.buttonManageTasks.get(toDoAppUserHome.taskindex).click();
	    String subtaskname="Subtask"+ToDoAppUserHomePage.generateCurrentDateTime();
	    toDoAppUserHome.addSubTask(subtaskname);
	    assertTrue((subtaskname.length()>2) && (subtaskname.length()<251),"Sub Task Name should have minimum 3 characters or maximum 250 characters ");

	    int i=toDoAppUserHome.getSubTask(subtaskname);
	
	    try {
	    String st_listname =toDoAppUserHome.linkSubTask.get(i).getText();
	    assertEquals(st_listname,subtaskname);
	    }
	    catch(ArrayIndexOutOfBoundsException e) {
	
		System.out.println(e.getMessage());
	    }
	
	    toDoAppUserHome.ButtonClose.click();
	    toDoAppUserHome.signout();
	
     }
	@Test (priority = 6)
	public void test_verifyNewTaskAppendedToCreatedTasksList() throws Throwable {
		//Getting the last row value of the tasks table
		
		ToDoAppUserHomePage toDoAppUserHome =new ToDoAppUserHomePage(driver);
		toDoAppUserHome.launchPage();
		toDoAppUserHome.addTask("testingTask");
		System.out.println("printing column values of last row of table: ");
		List<WebElement> columnOfLastRow= driver.findElements(By.xpath("//table[@class='table']/tbody/tr[last()]/td"));
		boolean taskAppended=false;
		for(WebElement e:columnOfLastRow)
		{
			System.out.println(e.getText());
			if(e.getText().contains("testingTask")) {
				taskAppended=true;
			}
		
		}
		assertTrue(taskAppended, "The new task is appended to the created tasks list as expected");
		toDoAppUserHome.signout();
    }
	
	
	//Test case for validating fields while adding tasks
	@Test(dataProvider="testdata", priority = 7)
	public void test_addTask_FieldValidation(String taskname)  {
	
	    ToDoAppUserHomePage toDoAppUserHome =new ToDoAppUserHomePage(driver);
	    toDoAppUserHome.launchPage();
	
    	//adding task
	    toDoAppUserHome.addTask(taskname);
	    toDoAppUserHome.getTask(taskname);
    	String listname =toDoAppUserHome.linkToDo.get(toDoAppUserHome.taskindex).getText();
    	assertEquals(listname,taskname);
	    assertTrue((taskname.length()>2) && (taskname.length()<251),"Task Name should have minimum 3 characters or maximum 250 characters ");
	    toDoAppUserHome.signout();
	    
	
	}
	
	
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){

   	return new Object[][] {
		{"abc"},
		{"ab"},
		{"1234"},
		{"task1234"},
		{"!@#$%"},
		{"   "},
		{""},
		{"testingmorethan250letters_for_task_name_aaaaaaabbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccccccccdddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefffffffffffffffffffffffffggggggggggggggg"},
	    {"123testing"}
	    
	};
	 
    }
	
} 
	
	
	