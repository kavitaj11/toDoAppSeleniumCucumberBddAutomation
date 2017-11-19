package com.avenuecode.todoAppPages;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import commonUtil.configFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToDoAppUserHomePage extends BaseTestPage{
	public String baseurl;
	public String email;
	public String password;
	public ToDoAppUserHomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public int taskindex=-1;
	public int subtaskindex=-1;

	@FindBy(xpath="//h1[normalize-space()='ToDo App']")
	public WebElement headerToDoApp; 	

	@FindBy(xpath="//a[starts-with(text(),'Welcome,')]") 
	public WebElement textWelcomeUser;

	@FindBy(xpath="//a[text()=\"Sign out\"]") 
	public WebElement linkSignOut;

	@FindBy(xpath="//input[@id='new_task']")
	public WebElement textBoxAdd; 
	
	@FindBy(xpath="//a[text()=\"My Tasks\"]")
	public WebElement linkMyTasks; 	

	@FindBy(xpath="//input[@id='new_task']/following-sibling::span") 
	public WebElement buttonAdd; 


	@FindBy(xpath="//td/a[@editable-text=\"task.body\"]") 
	public List<WebElement> linkToDo; 

	@FindBy(xpath="//td//button[contains(text(),\"Manage Subtasks\")]") 
	public List<WebElement> buttonManageTasks; 


	@FindBy(xpath="//h3") 
	public WebElement headerManageSubTask;

	@FindBy(xpath="//form[@name='sub_task_form']/textarea[@id='edit_task']") 
	public WebElement TextAreaEditTaskNAme; 

	@FindBy(xpath="//input[@name='new_sub_task']")
	public WebElement TextBoxSubTask; 

	@FindBy(xpath="//input[@name='due_date']")
	public WebElement TextBoxDueDate; 

	@FindBy(xpath="//button[@id='add-subtask']")
	public WebElement ButtonAddSubTask; 
	
	@FindBy(xpath="//td/a[@editable-text=\"sub_task.body\"]") 
	public List<WebElement> linkSubTask; 

	@FindBy(xpath="//button[text()=\"Close\"]")
	public WebElement ButtonClose;
	
	@FindBy(xpath="//h1[text()[contains(.,'ToDo List')]]")
	public WebElement headerMessageToDoApp;
	
	

	public void launchPage(){
		configFileReader config = new configFileReader();
		
	    baseurl=config.getProperty("baseurl");
	    email=config.getProperty("email");
	    password=config.getProperty("password");
	   		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ToDoAppPublicPage toDoAppPublicPage= new ToDoAppPublicPage(driver);
        waitForPresenceOfTheElement(By.linkText("Sign In"));
		toDoAppPublicPage.linkSignIn.click();
		
		ToDoAppSignInPage toDoAppSignIn =new ToDoAppSignInPage(driver);
		toDoAppSignIn.signIn(email,password);
	}




	public void addTask(String task) {
		linkMyTasks.click();
		textBoxAdd.clear();
		textBoxAdd.sendKeys(task);
		buttonAdd.click();

	}
	public int getTask(String task) {
		
		for(WebElement item:linkToDo){
			taskindex++;
			if(item.getText().equals(task)){
			 break;
		
			}
			
		}
		return taskindex;
	}

	public int getSubTask(String subtask) {
		
		for(WebElement subitem:linkSubTask){
			subtaskindex++;
			if(subitem.getText().equals(subtask)){
			 break;
		
			}
			
		}
		return subtaskindex;
	}
	
	public void addSubTask(String subtask) {
		
		TextBoxSubTask.clear();
		TextBoxSubTask.sendKeys(subtask);
		String duedate =new SimpleDateFormat("MM/DD/yyyy").format(new Date());
		TextBoxDueDate.clear();
		TextBoxDueDate.sendKeys(duedate);
		ButtonAddSubTask.click();
		
		
	}
	public void signout() {
		linkSignOut.click();
	}
	public static String generateCurrentDateTime() {
		return new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	}
}
