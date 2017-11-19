package com.avenuecode.todoAppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToDoAppPublicPage extends BaseTestPage{
	public ToDoAppPublicPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[text()=\"Sign In\"]")
	public WebElement linkSignIn; 	
	

}
