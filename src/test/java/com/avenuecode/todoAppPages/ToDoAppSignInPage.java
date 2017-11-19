package com.avenuecode.todoAppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ToDoAppSignInPage extends BaseTestPage{
	
	public ToDoAppSignInPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//h1[normalize-space()='ToDo App']")
	public WebElement headerToDoApp; 	
	
	@FindBy(xpath="//input[@id=\"user_email\"]") 
	public WebElement textBoxEmail; 
	
	@FindBy(xpath ="//input[@id=\"user_password\"]")
	public WebElement textBoxpassword; 	
	
	@FindBy(xpath="//input[@type='submit']") 
	public WebElement buttonSignIn; 
	
	public void signIn(String email, String password) {
		textBoxEmail.clear();
		textBoxEmail.sendKeys(email);
		textBoxpassword.clear();
		textBoxpassword.sendKeys(password);
		buttonSignIn.click();
		
	}
}
