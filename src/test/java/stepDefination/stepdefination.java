package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class stepdefination {
	
	WebDriver driver;

    @Given("^user is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("Navigating to the landing page");
    	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
    					driver=new ChromeDriver();
    					driver.get("https://www.facebook.com/");
        
    }

    @When("^User log in to the application with userid \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_log_in_to_the_application_with_userid_something_and_password_something(String strArg1, String strArg2) throws Throwable 
    {
    	System.out.println("Username and password enhtered");
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(strArg1);
    		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(strArg2);
    		driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
     System.out.println("Home page populated successfully");
    }

    @And("^cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        if(strArg1.equals("true"))
        {
        	System.out.println("Cards are displayed");
        }
        else
        {
        	System.out.println("Cards are not displayed");
        }
    }

}