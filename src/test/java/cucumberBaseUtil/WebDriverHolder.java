package cucumberBaseUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHolder {
    private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }
    public static void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/server/chromedriver.exe");
        driver = new ChromeDriver();
    }
}