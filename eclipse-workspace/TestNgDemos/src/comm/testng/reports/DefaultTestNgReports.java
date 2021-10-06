package comm.testng.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DefaultTestNgReports {
  @Test
  public void f() {
	  Reporter.log("Opening Browser");
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\k74\\Downloads\\tools\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Reporter.log("Opening Browser");
		driver.get("http://techgatha.com/contact.html");
		Reporter.log("Browser opened");
		driver.findElement(By.id("name")).sendKeys("Driver 1");
		Reporter.log("name entered in the textbox");
		driver.close();
		Reporter.log("Closed Browser");
  }
}
