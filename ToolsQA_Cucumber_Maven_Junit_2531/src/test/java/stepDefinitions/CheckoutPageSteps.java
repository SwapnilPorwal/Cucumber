package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;
 
public class CheckoutPageSteps {
	TestContext testContext;
	CheckoutPage checkoutPage;
	
	public CheckoutPageSteps(TestContext context) {
		testContext = context;
		checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
	}
	
	@Given("^Enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page(){
		checkoutPage.fill_PersonalDetails();	
	}
	
	@Given("^Select same delivery address$")
	public void select_same_delivery_address() {
		checkoutPage.check_ShipToDifferentAddress(false);
	}
	
	@Given("^Select payment method as \"([^\"]*)\" payment$")
	public void select_payment_method_as_payment(String arg1) throws InterruptedException{
		checkoutPage.select_PaymentMethod("CheckPayment");
		Thread.sleep(5000);
	}
 
	@Given("^Place the orde$")
	public void place_the_orde() {
		checkoutPage.check_TermsAndCondition(true);
		checkoutPage.clickOn_PlaceOrder();	
		
		testContext.getWebDriverManager().closeDriver();
	}	
	
	/**@Then("^Print the order No$")
	public void print_the_order_No() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		WebElement orderNumber = driver.findElement(By.xpath("//li[@class='order']/strong"));
		System.out.println("Order No : "+orderNumber.getText());
		
	}
	**/
}
 