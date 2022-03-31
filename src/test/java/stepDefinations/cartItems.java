package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartItems {

	WebDriver driver = null;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:/Users/Smita/Desktop/Smita Folder/Eclipse workspace/Automating/src/test/java/drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		 
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		
		driver.get("https://www.belazu.com");

	}

	@And("User enters text as {string} in the Search box")
	public void user_enters_text_as_in_the_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	

		driver.findElement(By.className("ms-search__form-control")).sendKeys("Pasta");
	}

	@And("Clicks enter")
	public void clicks_enter() {
	    // Write code here that turns the phrase above into concrete actions
	 
		driver.findElement(By.className("ms-search__form-control")).sendKeys(Keys.ENTER);
	
		
	}

	@And("selects the first product")
	public void selects_the_first_product() {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.findElement(By.cssSelector("a[aria-label*='Dried Penne']")).click();
		
	}

	@And("adds to the bag")
	public void adds_to_the_bag() {
	    // Write code here that turns the phrase above into concrete actions
	  
	    driver.findElement(By.cssSelector("button.product-addButton")).click();
	
	}

	
	@And("Click on the shopping bag")
	public void click_on_the_shopping_bag() {
	    // Write code here that turns the phrase above into concrete actions
	  
	    driver.findElement(By.className("minicart-container-shop")).click();
	
	}
    @Then ("the items in the bag should be same as the item selected")
	 public void the_items_in_the_bag_should_be_same_as_the_item_selected() {
	    // Write code here that turns the phrase above into concrete actions
	  
	    driver.findElement(By.cssSelector("a[data-exp-event-id = 'Cart Page.Cart.5637152307.click']")).click();
	
	    
	    driver.close();
	}

    
}
