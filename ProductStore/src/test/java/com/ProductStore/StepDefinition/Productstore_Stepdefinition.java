package com.ProductStore.StepDefinition;

import org.junit.Assert;

import com.ProductStore.pagesobjects.AboutUsPage;
import com.ProductStore.pagesobjects.AddToCartPage;
import com.ProductStore.pagesobjects.CheckForPhoneNumberPage;
import com.ProductStore.pagesobjects.CheckForTwoProductPage;
import com.ProductStore.pagesobjects.ContactPage;
import com.ProductStore.pagesobjects.CountOfMobilesPage;
import com.ProductStore.pagesobjects.DeleteCartPage;
import com.ProductStore.pagesobjects.DescriptionPage;
import com.ProductStore.pagesobjects.InvalidPlaceOrderPage;
import com.ProductStore.pagesobjects.LoginPage;
import com.ProductStore.pagesobjects.MonitorPricePage;
import com.ProductStore.pagesobjects.SelectAProductFromNextPage;
import com.ProductStore.pagesobjects.SelectLaptopPage;
import com.ProductStore.pagesobjects.SignUpPage;
import com.ProductStore.pagesobjects.ValidPlaceOrderPage;

import Excel_utility.excel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Productstore_Stepdefinition {
	//Signup
	SignUpPage signup=new SignUpPage();
	//Login
	LoginPage login=new LoginPage();
	excel ex=new excel(); //excel
	//Addtocart
	AddToCartPage cart =new  AddToCartPage();
	//Contact
	ContactPage contact=new ContactPage ();
	//To select a product from the next page
	SelectAProductFromNextPage product=new SelectAProductFromNextPage();
	//Delete from cart
	DeleteCartPage deletefromcart=new DeleteCartPage();
	//To select a laptop
	SelectLaptopPage laptop=new SelectLaptopPage();
	//To check for valid phonenumber
	CheckForPhoneNumberPage phonenumber=new CheckForPhoneNumberPage();
	//To get description of a product 
	DescriptionPage description=new DescriptionPage();
	//To add two product in the cart 
	CheckForTwoProductPage two_product=new CheckForTwoProductPage();
	//valid place of order
	ValidPlaceOrderPage placeorder= new ValidPlaceOrderPage();
	//Invaild place of order
	InvalidPlaceOrderPage invalidorder= new InvalidPlaceOrderPage();
	//To get the monitor price
	MonitorPricePage monitorprice= new MonitorPricePage();
	//About us
	AboutUsPage Aboutus=new AboutUsPage();
	//Count of Mobiles
	CountOfMobilesPage mobiles=new CountOfMobilesPage();
	
//Signup	
	
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		signup.launchBrowser("chrome");
	}

	@When("^the user opens product store homepage$")
	public void the_user_opens_product_store_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		signup.homePage();
	}

	@Then("^the user enters username and password$")
	public void the_user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		signup.usernamePassword();
	}

	@Then("^the user clicks signup$")
	public void the_user_clicks_signup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		signup.signUp(); 
	}

	@Then("^the user close the application$")
	public void the_user_close_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		signup.quit();
	}
//Login
	@When("^user opens product store homepage$")
	public void user_opens_product_store_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.launchBrowser("chrome");
		   login.productStore();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		login.loginUsernamePassword(ex.excelUsername(1),ex.excelPassword(1));
		Thread.sleep(3000);
		login.logout();
		Thread.sleep(3000);
		login.quitt();
		int count=ex.rowCount();
		for(int i=2;i<=count;i++)
		{
			login.launchBrowser("chrome");
			login.productStore();
			login.loginUsernamePassword(ex.excelUsername(i),ex.excelPassword(i));
			Thread.sleep(3000);
			login.alertHandling();
			if (i==2) {
				login.quitt();
		}
 }
	}

	@Then("^user clicks login$")
	public void user_clicks_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.quitt();
	}

	@When("^user opens product store Homepage$")
	public void user_opens_product_store_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		cart.launchBrowser("chrome");
	    cart.productStore();;
	}

	@Then("^user clicks on product and add to cart$")
	public void user_clicks_on_product_and_add_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 cart.cart();
		    cart.quit();
	}
//Contact
	@When("^user opens Product store Homepage$")
	public void user_opens_Product_store_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contact.launchBrowser("chrome");
	    contact.product_store();
	}

	@Then("^user clicks contact$")
	public void user_clicks_contact() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contact.contact();
	}

	@Then("^user enters contact details$")
	public void user_enters_contact_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contact.contactDetails("mmmbady@gmail.com", "sheeba", "hi");
	}

	@Then("^user clicks send message$")
	public void user_clicks_send_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		contact.sendMessage();
		contact.quit();
	}
	
//To select a product from the next
	
	@When("^user opens Product Store Homepage$")
	public void user_opens_Product_Store_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		product.launchBrowser("chrome");
		product.productStore();
	}

	@Then("^user clicks next$")
	public void user_clicks_next() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		product.clickNext();
	}

	@Then("^user selects product$")
	public void user_selects_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		product.selectProduct();
		product.quit();
	}

//Delete from cart
	
	@When("^user opens Product store homepages$")
	public void user_opens_Product_store_homepages() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletefromcart.launchBrowser("chrome");
		deletefromcart.productStore();
	}

	@Then("^user clicks cart$")
	public void user_clicks_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletefromcart.cart();
	}

	@Then("^delete the product in cart$")
	public void delete_the_product_in_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		deletefromcart.delete();
		deletefromcart.exitBrowser();
	}

//To select a laptop
	
	@When("^User opens Product store homepage$")
	public void user_opens_Product_store_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		laptop.launchBrowser("chrome");
		laptop.productStore();
	}

	@Then("^User clicks laptop tab$")
	public void user_clicks_laptop_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		laptop.laptop();
	}

	@Then("^User selects a laptop and gets price of specific laptop$")
	public void user_selects_a_laptop_and_gets_price_of_specific_laptop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		laptop.value();
		laptop.exit();
	}

	@When("^User opens product Store homepage$")
	public void user_opens_product_Store_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		phonenumber.launchBrowser("chrome");
		phonenumber.productStore();
	}

	@Then("^User checks if the number is valid$")
	public void user_checks_if_the_number_is_valid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ab=phonenumber.check();
		String phone_number="440 123456";
		Assert.assertEquals(phone_number,ab);
		System.out.println("Valid");
		Thread.sleep(3000);
		phonenumber.exitApplication();
	}
	
//To get description of the product
	
	@When("^The User opens product Store homepage$")
	public void the_User_opens_product_Store_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		description.launchBrowser("chrome");
		description.productStore();
	}

	@Then("^User gets the description of the specific product$")
	public void user_gets_the_description_of_the_specific_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		description.getDescription();
		description.exitBrowser();;
	}

//To add two product in the cart 
	
	@When("^The User open product Store homepage$")
	public void the_User_open_product_Store_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		two_product.launchBrowser("chrome");
		two_product.productStore();
	}

	@Then("^user need to check whether the added product is available in cart$")
	public void user_need_to_check_whether_the_added_product_is_available_in_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		two_product.clickOne();
		two_product.clickAgain();
	   String productOne = two_product.firstProduct();
	   String productTwo=two_product.secondProduct();
	   System.out.println(productOne);
	   System.out.println(productTwo);
	   if(productOne.equalsIgnoreCase("HTC One M9")||productTwo.equalsIgnoreCase("Sony xperia z5")||productOne.equalsIgnoreCase("Sony xperia z5"))
	   {
		   
		   Assert.assertTrue(true);
		   System.out.println("Scenario passed");
		   
	   }

	   two_product.closeBrowser();;
	}
	
//Valid place of order
	
	@When("^The user opens the homepage$")
	public void the_user_opens_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		placeorder.launchBrowser("chrome");
		placeorder.productStore();
	}

	@Then("^The user adds the product to cart and places the order$")
	public void the_user_adds_the_product_to_cart_and_places_the_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		placeorder.clickPlaceOrder();;
	}

	@Then("^The user enters all the valid details to purchase the product$")
	public void the_user_enters_all_the_valid_details_to_purchase_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		placeorder.fillDetails();
	}

	@Then("^The user closes the application$")
	public void the_user_closes_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		placeorder.quit();
	}
	
//invalid place of order
	
	@When("^user opens the homepage$")
	public void user_opens_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		invalidorder.launchBrowser("chrome");
		invalidorder.productStore(); 
	}

	@Then("^user adds the product to the cart to place the order$")
	public void user_adds_the_product_to_the_cart_to_place_the_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		invalidorder.clickPlaceOrder();
	}

	@Then("^The user enters the invalid details to purchase the product$")
	public void the_user_enters_the_invalid_details_to_purchase_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		invalidorder.purchase();
	}

	@Then("^user close the application$")
	public void user_close_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		invalidorder.close();
	}
	
//To get the monitor price
	
	@When("^The user opens Product store page$")
	public void the_user_opens_Product_store_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		monitorprice.launchBrowser("chrome");
		monitorprice.productStore();
	}

	@Then("^The user clicks monitors$")
	public void the_user_clicks_monitors() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		monitorprice.clickMonitor();
	}

	@Then("^The user clicks Apple monitor to get the price$")
	public void the_user_clicks_Apple_monitor_to_get_the_price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		monitorprice.printPrice();
	}

	@Then("^The user closes the homepage$")
	public void the_user_closes_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		monitorprice.close();
	}
	
//Aboutus
	
	@When("^The user Clicks on About Us in the homepage$")
	public void the_user_Clicks_on_About_Us_in_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Aboutus.launchBrowser("chrome");
		Aboutus.productStore();
	}

	@Then("^The user plays the video$")
	public void the_user_plays_the_video() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Aboutus.clickAboutUs();
 		Aboutus.playVideo();
	}

	@Then("^user closes the homepage$")
	public void user_closes_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Aboutus.close();
	}
	
//Count of mobiles
	
	@When("^user opens productstore homepage$")
	public void user_opens_productstore_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mobiles.launchBrowser("chrome");
		mobiles.ProductStore();
	}

	@Then("^count the number of mobile present in the page$")
	public void count_the_number_of_mobile_present_in_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mobiles.mobileCount();
	}

	@Then("^The user close the chrome$")
	public void the_user_close_the_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mobiles.Close();
	}

	

}
