Feature: Product_Store
@Tc01_SignUp
Scenario: 
	Sign Up to Product store 
Given the user launched the chrome browser
When the user opens product store homepage
Then the user enters username and password
Then the user clicks signup
And the user close the application
	
@Tc02_Login
Scenario: 
	Login to Product store 
When user opens product store homepage
Then user enters username and password
Then user clicks login

@Tc03_Add_to_cart
Scenario: 
	To add a product to cart 
When user opens product store Homepage 
Then user clicks on product and add to cart 
	
@Tc04_Contact
Scenario: 
	To contact 
When user opens Product store Homepage
Then user clicks contact
Then user enters contact details
Then user clicks send message
	
@Tc05_clickproduct
Scenario: 
	To select a product in the next page
When user opens Product Store Homepage
Then user clicks next
Then user selects product
	
@Tc06_DeleteCart
Scenario: 
	To delete a product
When user opens Product store homepages 
Then user clicks cart
Then delete the product in cart
	
@Tc07_SelectLaptop
Scenario: 
	To get price of a specific laptop
When User opens Product store homepage
Then User clicks laptop tab
Then User selects a laptop and gets price of specific laptop

@Tc08_To_check_phone_number
Scenario: 
	To check phone no
When User opens product Store homepage
Then User checks if the number is valid
	
@Tc09_To_get_description
Scenario: 
	To get the product description
When The User opens product Store homepage
Then User gets the description of the specific product
	
@Tc10_To_add_two_product
Scenario: 
	To add more than one product to cart
When The User open product Store homepage
Then user need to check whether the added product is available in cart
	
@Tc11_Valid_PlaceOrder
Scenario:
	To place order
When The user opens the homepage
Then The user adds the product to cart and places the order
Then The user enters all the valid details to purchase the product
And The user closes the application
	
@Tc12_Invaild_placeorder
Scenario:
	To handle a invalid place order
When user opens the homepage
Then user adds the product to the cart to place the order
Then The user enters the invalid details to purchase the product
And user close the application

@Tc13_To_get_monitor_price
Scenario:	
	To print name of the apple motitor
When The user opens Product store page
Then The user clicks monitors
Then The user clicks Apple monitor to get the price
And The user closes the homepage
				
@Tc14_aboutus
Scenario:	
	To check the user is able to play the video
When The user Clicks on About Us in the homepage
Then The user plays the video
And user closes the homepage

@Tc15-Count_of_mobiles
Scenario:
	To count the number of mobiles present in the webpage 
When user opens productstore homepage
Then count the number of mobile present in the page
Then The user close the chrome
