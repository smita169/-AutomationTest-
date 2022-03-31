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

public class removeItems {

	WebDriver driver = null;
	
	@Given("User is on Chrome browser")
	public void user_is_on_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:/Users/Smita/Desktop/Smita Folder/Eclipse workspace/Automating/src/test/java/drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
 
	}

	@When("User opens website {string}")
	public void user_opens_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://www.belazu.com"); 
	}
	
	@And("User enters value in the Search box")
	public void user_enters_value_in_the_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.findElement(By.name("q")).sendKeys("Casablanca Olives");
	
	}

	
	@And("Clicks on enter")
	public void clicks_on_enter() {
	    // Write code here that turns the phrase above into concrete actions
	 
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}
		@And("select the first product")
		public void select_the_first_product() {
		    // Write code here that turns the phrase above into concrete actions
		  
			driver.findElement(By.cssSelector("a[aria-label = 'Casablanca Olives £33.50 ']")).click();
			
		
	}
	@And("clicks add to the bag")
	public void clicks_add_to_the_bag() {
	    // Write code here that turns the phrase above into concrete actions
	  
	    driver.findElement(By.cssSelector("button.product-addButton")).click();
	
	}
	
	@And("click View basket and checkout")
	public void click_view_basket_and_checkout() {
		
        driver.findElement(By.cssSelector("a.msc-add-to-cart__dialog__go-to-cart msc-btn")).click();
		
	}
	

	@And("clicks on the delete icon")
	public void clicks_on_the_delete_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.cssSelector("i.cartitem-content-deleteicon")).click();
		
	}

	@Then("the items in the bag should be removed and bag should be empty.")
	public void the_items_in_the_bag_should_be_removed_and_bag_should_be_empty() {
	    // Write code here that turns the phrase above into concrete actions
	  
		 driver.findElement(By.cssSelector("p.msc-cart-line")).getText();

	}
}
