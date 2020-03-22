$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Productstores.feature");
formatter.feature({
  "line": 1,
  "name": "Product_Store",
  "description": "",
  "id": "product-store",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "Sign Up to Product store",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Tc01_SignUp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user opens product store homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user clicks signup",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user close the application",
  "keyword": "And "
});
formatter.match({
  "location": "Productstore_Stepdefinition.the_user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 4213464000,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Productstore_Stepdefinition.the_user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Productstore_Stepdefinition.the_user_clicks_signup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Productstore_Stepdefinition.the_user_close_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "Login to Product store",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Tc02_Login"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user opens product store homepage",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks login",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_clicks_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "To add a product to cart",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Tc03_Add_to_cart"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user opens product store Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user clicks on product and add to cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_clicks_on_product_and_add_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "",
  "description": "To contact",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@Tc04_Contact"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user opens Product store Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user clicks contact",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user enters contact details",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user clicks send message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_clicks_contact()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_enters_contact_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_clicks_send_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 33,
  "name": "",
  "description": "To select a product in the next page",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@Tc05_clickproduct"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user opens Product Store Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user clicks next",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user selects product",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_clicks_next()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_selects_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 40,
  "name": "",
  "description": "To delete a product",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@Tc06_DeleteCart"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "user opens Product store homepages",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "user clicks cart",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "delete the product in cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_opens_Product_store_homepages()"
});
formatter.result({
  "duration": 8066301400,
  "status": "passed"
});
formatter.match({
  "location": "Productstore_Stepdefinition.user_clicks_cart()"
});
