package Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
public void launchApplication(String url) {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	
}

public void enterText (WebElement element,String textvalue) {
	element.sendKeys(textvalue);
	
}
public void click(WebElement element) {
	element.click();
	
}
}
