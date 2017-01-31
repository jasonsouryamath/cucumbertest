package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class datechangeccadmin {
	public static WebDriver driver;
	@Given("^I Open FireFox instance and navigate to smartGFE$")
	public void i_open_firefox_browser_and_navigate_to_closingcorp_SmartGFE() throws Throwable {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\jsouryamath\\Desktop\\geckodriver.exe");
		   driver =new FirefoxDriver();
		   driver.get("https://ccadmin.closingcorp.com/");
	}

	@When("^I enter a valid username and password$")
	public void i_enter_a_valid_username_and_password() throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys("mmckinney@closing.com");
		driver.findElement(By.id("password")).sendKeys("Mike4691",Keys.ENTER);
	}
	
	@When("^I click DART tab$")
	public void i_click_DART_tab() throws Throwable {
		
		new WebDriverWait (driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/DART']"))).sendKeys(Keys.ENTER);
	}

	@Then("^if i click Data tab i should see a list of desired states to choose from$")
	public void if_i_click_Data_tab_i_should_see_a_list_of_desired_states_to_choose_from() throws Throwable {
		
		new WebDriverWait (driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/DART/States']"))).sendKeys(Keys.ENTER);
		new WebDriverWait (driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='NJ']"))).click();
		Thread.sleep(1000);
		 
	}

	@Then("^when it clicks a new tab is opened up and browser switches to active tab and iterate dates and the loops repeat until its breakpoint$")
	public void when_it_clicks_a_new_tab_is_opened_up_and_browser_switches_to_active_tab() throws Throwable {
		
		 
		    List<WebElement> Lists  = driver.findElements(By.cssSelector("#office-list > li:nth-child(n+12) > a:nth-child(1) > i:nth-child(1)"));
		 for(WebElement List:Lists) {
			
			    List.click();
		// if (driver.findElement(By.cssSelector("#office-list > li:nth-child(1) > a:nth-child(1) > i:nth-child(1)")).equals(List))
			      //  break;  
		 
		ArrayList<String> tab2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tab2.get(1));
	    
	    
	   //select the calendar jquery
	    new WebDriverWait (driver,10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-datepicker-trigger"))).click();
	    
	    // select the year 
	    new WebDriverWait (driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='ui-datepicker-year']//option[@value='2017']"))).click();
	    			
	      //select the month
	    new WebDriverWait (driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='ui-datepicker-month']//option[@value='0']"))).click();
	
	       // select the day in the month
	    new WebDriverWait (driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ui-datepicker-div']//a[text()='16']"))).click();
	 
	 	
	    
	        driver.findElement(By.cssSelector("input.btn")).click();
	        driver.close();
	        {
	        driver.switchTo().window(tab2.get(0));
	       }
	}
	
	} 
	
	
}
	
	

	
	