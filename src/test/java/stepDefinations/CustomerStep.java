package stepDefinations;



import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class CustomerStep{ 
WebDriver driver;

@Given("user navigate browser")
public void user_navigate_browser() throws Throwable {
	driver =FunctionLibrary.startBrowser();
}
@When("user luach url")
public void user_luach_url() {
   FunctionLibrary.openUrl();
}
@When("user waite for username with {string}  and {string}")
public void user_waite_for_username_with_and(String LocatorType, String LocatorValue) {
    FunctionLibrary.waiteForElement(LocatorType, LocatorValue, "10");
}

@When("Enter username with {string} and {string} and {string}")
public void enter_username_with_and_and(String LocatorType, String locatorValue,String TestData) {
    FunctionLibrary.typeAction(LocatorType, locatorValue, TestData);
}
@When("Enter password with {string} and {string} and {string}")
public void enter_password_with_and_and(String LocatorType, String locatorValue,String TestData) {
   FunctionLibrary.typeAction(LocatorType, locatorValue, TestData);
}
@When("click login button with {string} and {string}")
public void click_login_button_with_and(String LocatorType, String locatorValue) {
    FunctionLibrary.clickAction(LocatorType, locatorValue);
}
@When("user waite for Customer link with {string} and {string}")
public void user_waite_for_customer_link_with_and(String LocatorType, String locatorValue) {
    FunctionLibrary.waiteForElement(LocatorType, locatorValue,"10");
}
@When("user click for the Customer link with {string} and {string}")
public void user_click_for_the_customer_link_with_and(String LocatorType, String locatorValue) {
	FunctionLibrary.clickAction(LocatorType, locatorValue);
    
}
@When("user waite for Add button with {string} and {string}")
public void user_waite_for_add_button_with_and(String LocatorType, String locatorValue) {
	FunctionLibrary.waiteForElement(LocatorType, locatorValue,"10");
    
}
@When("click Add button with {string} and {string}")
public void click_add_button_with_and(String LocatorType, String locatorValue) {
    FunctionLibrary.clickAction(LocatorType, locatorValue);
}
@When("user waite for Customer number button with {string} and {string}")
public void user_waite_for_customer_number_button_with_and(String LocatorType, String locatorValue) {
    FunctionLibrary.waiteForElement(LocatorType, locatorValue, "10");
}
@When("capture Customer number with {string} and {string}")
public void capture_customer_number_with_and(String LocatorType, String locatorValue) throws Throwable {
    FunctionLibrary.costomerCap(LocatorType, locatorValue);
}
@When("Enter in {string} with {string} and {string}")
public void enter_in_with_and(String TestData,String LocatorType, String locatorValue) throws Throwable {
FunctionLibrary.typeAction(TestData,LocatorType, locatorValue);
}
@When("click alert ok button with {string} and {string}")
public void click_alert_ok_button_with_and(String LocatorType, String locatorValue) {
    FunctionLibrary.clickAction(LocatorType, locatorValue);
}
@When("waite for confirm ok button with {string} and {string}")
public void waite_for_confirm_ok_button_with_and(String LocatorType, String locatorValue) {
    FunctionLibrary.waiteForElement(LocatorType, locatorValue, "10");
}
@When("click Confirm Ok button with {string} and {string}")
public void click_confirm_ok_button_with_and(String LocatorType, String locatorValue) {
    FunctionLibrary.clickAction(LocatorType, locatorValue);
}
@When("waite for alert ok button with {string} and {string}")
public void waite_for_alert_ok_button_with_and(String LocatorType, String locatorValue) {
    FunctionLibrary.waiteForElement(LocatorType, locatorValue, "10");
}
@When("validate customer table")
public void validate_customer_table() throws Throwable {
    FunctionLibrary.customerTable();
}
@When("click logout button with {string} and {string}")
public void click_logout_button_with_and(String LocatorType, String locatorValue) {
   FunctionLibrary.clickAction(LocatorType,locatorValue );
}
@When("close the browser")
public void close_the_browser() {
    FunctionLibrary.closeBrowser();
}



}
