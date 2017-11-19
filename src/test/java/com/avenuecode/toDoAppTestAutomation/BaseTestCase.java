package com.avenuecode.toDoAppTestAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.avenuecode.automationBaseClasses.BrowserDriver;
import com.avenuecode.automationBaseClasses.CreateBrowser;
import com.avenuecode.todoAppPages.BaseTestPage;

public class BaseTestCase {
	public static WebDriver driver;
	@BeforeSuite
	public void beforeSuite() throws IOException{
			

	}
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
	
	@BeforeTest
	public void beforeTest(){
		if(driver==null) {
			driver=CreateBrowser.getBrowser();
		}
		
	
	
		
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
	}
	@BeforeMethod
	public void beforeMethod(){
	
	}
	@AfterTest()
	 public void teardown(ITestResult result){
	        captureScreenShotInCaseOfFailure(result);
	        BrowserDriver.getCurrentDriver().close();

	    }
	
	
    protected void captureScreenShotInCaseOfFailure(ITestResult result) {
        if (result.isSuccess()) {
            return;
        }
        String screenShotFolder = "screenshots";
        File screenShotSourceFile = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.FILE);
        try {
            createFolder(screenShotFolder);
            String fileName = result.getMethod().getMethodName();
            File screenShotTargetFile = getTargetFile(screenShotFolder, fileName, "png");
            FileUtils.copyFile(screenShotSourceFile, screenShotTargetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }        
       
      }
	
	 private void createFolder(String folderName) throws IOException {
         if (!(new File(folderName).exists())) new File(folderName).mkdir();
     }

     private File getTargetFile(String folderName, String fileName, String ext) throws IOException {
         String rootPath = new File(".").getCanonicalPath();
         String fullPath = String.format("%s//%s//%s.%s", rootPath, folderName, fileName, ext);
         return new File(fullPath);
     }
	

	}




