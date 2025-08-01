package stepdefinitionfiles;


	
	import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangehrmpages.DashboardPage;

	public class SupportSteps extends BaseClass {

		private DashboardPage dp;

	    @When("I close any popup if present")
	    public void i_close_any_popup_if_present() {
	        dp = new DashboardPage(driver); // Initialize here
	        //dp.closePopupIfPresent();
	    }

	    @When("I click the profile dropdown")
	    public void i_click_the_profile_dropdown() {
	        dp.clickProfileDropdown();
	    }

	    @When("I click on Support link")
	    public void i_click_on_support_link() {
	        dp.clickSupport();
	    }

	    @Then("I should see text {string}")
	    public void i_should_see_text(String expectedText) {
	        Assert.assertTrue(dp.isGettingStartedTextVisible(),
	                "Expected text was not found: " + expectedText);
	    }
	}