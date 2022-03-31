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

public class stepDefination {

	WebDriver driver = null;

	@Given("User opens Chrome browser")
	public void user_opens_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:/Users/Smita/Desktop/Smita Folder/Eclipse workspace/Automating/src/test/java/drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		 
	}

	@When("User is on site {string}")
	public void user_is_on_site(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		
		driver.get("https://www.belazu.com");

	}

	@And("User enters text in the Search box")
	public void user_enters_text_in_the_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    
	

		driver.findElement(By.className("ms-search__form-control")).sendKeys("Pasta");
	}


	@And("I click Enter")
	public void i_click_enter() {
		
		driver.findElement(By.className("ms-search__form-control")).sendKeys(Keys.ENTER);

	}

	@And("I select an item")
	public void i_select_an_item() {
		
	    driver.findElement(By.cssSelector("a[aria-label*='Dried Penne']")).click();
	
	}

	@And("I Add item to the bag")
	public void i_add_item_to_the_bag() {
		
	    driver.findElement(By.cssSelector("button.product-addButton")).click();
	
		
	}

	@And("I click View bag and checkout")
	public void i_click_view_bag_and_checkout() {
		
        driver.findElement(By.cssSelector("a[aria-label = 'View bag and checkout']")).click();
		
	}

	
	@And("I click on Guest checkout")
	public void i_click_on_guest_checkout() {
	
		driver.findElement(By.cssSelector("a[title='Guest Checkout']")).click();
	
	}
	@Then("I should be navigated to the Secure checkout Screen")
	public void i_should_be_navigated_to_the_secure_checkout_screen() {
		
	 driver.findElement(By.cssSelector("span.customHeaderContainer-title")).getText();
 
	 driver.close();
	 
	}
	}
