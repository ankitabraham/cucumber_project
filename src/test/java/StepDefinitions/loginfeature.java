package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginfeature {
	
	WebDriver driver;
	@Before
	public void set_up()
	{
		System.out.println("Before the launch of the website");
	}
	@After
	public void tear_down()
	{
		System.out.println("After the closing of the website");
	}
	@Given("i launch the chrome browser")
	public void i_launch_the_chrome_browser() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\chromedriver.exe\\");
	     driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("i open orangehrm home page")
	public void i_open_orangehrm_home_page() throws InterruptedException
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	     Thread.sleep(300);
	}

	@Then("I verify logo is present on the page")
	public void i_verify_logo_is_present_on_the_page() throws Exception 
	{
		Boolean status = driver.findElement(By.xpath("//div[@id = 'divLogo']/img")).isDisplayed();
		Assert.assertEquals(true, status);
		Thread.sleep(500);
	}

	@Then("close browser")
	public void close_browser() 
	{
	  driver.close();
	}
//---------------------------------------------------------------------------------------------//
	

@When("Enter username and password")
public void enter_username_and_password() throws Exception {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(400);
}

@When("click on login button")
public void click_on_login_button() throws Exception 
{
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(400);
}

@Then("User should successfully login to the dashboard page")
public void user_should_successfully_login_to_the_dashboard_page() {
  
	String result = driver.findElement(By.xpath("//b[text() = 'Dashboard']")).getText();	////b[text() = 'Dashboard']
	Assert.assertEquals("Dashboard", result);
}

@When("Enter username {string} and password {string}")
public void enter_username_and_password(String username, String password) throws Exception 
{
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(400);	
   
}

}
