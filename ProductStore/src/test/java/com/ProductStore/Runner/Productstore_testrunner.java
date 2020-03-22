package com.ProductStore.Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/Productstores.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@Tc01_SignUp,@Tc02_Login,@Tc03_Add_to_cart,@Tc04_Contact,@Tc05_clickproduct,@Tc06_DeleteCart,@Tc07_SelectLaptop,@Tc08_To_check_phone_number,@Tc09_To_get_description,@Tc10_To_add_two_product,@Tc11_Valid_PlaceOrder,@Tc12_Invaild_placeorder,@Tc13_To_get_monitor_price,@Tc14_aboutus,@Tc15-Count_of_mobiles"},
		glue = {"com.ProductStore.StepDefinition"},
		monochrome = true
		)
public class Productstore_testrunner {

}
