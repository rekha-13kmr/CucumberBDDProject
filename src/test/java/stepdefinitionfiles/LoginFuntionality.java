package stepdefinitionfiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import orangehrmpages.LoginPage;

public class LoginFuntionality {

	private WebDriver driver;
    private  LoginPage lp;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
    @Given("I am on the OrangeHRM login page")
	public void i_am_on_the_orange_hrm_login_page() {
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 lp = new LoginPage(driver); 
		 }

	@Given("I have entered a valid username and password")
	public void i_have_entered_a_valid_username_and_password() {
		lp.username("Admin");
		lp.password("admin123");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		lp.clbtn();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	    
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Given("I have entered invalid {string} and {string}")
	public void i_have_entered_invalid_and(String user, String pass) {
	   lp.username(user);
	   lp.password(pass);
	}
	@Then("I should see an error message indicating {string}")
	public void i_should_see_an_error_message_indicating(String string) {
		 Assert.assertEquals(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).isDisplayed(), true);
			
	}
	}




