package DifinitionSteps;

import java.io.IOException;

import TestActions.Actions;
import TestBases.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExpediaSteps extends TestBase {
	
	public ExpediaSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	Actions act = new Actions();

	@Given("^Open init browser$")
	public void open_init_browser() throws Throwable {
	    TestBase.initBrowser();
	}

	@Given("^Click button Flights$")
	public void click_button_Flights() throws Throwable {
	    act.clickToElement(prop.getProperty("btnFlights"));
	}

	@When("^Enter information$")
	public void enter_information() throws Throwable {
		String text_01 = "Ho Chi Minh";
		String Expected = "Ho Chi Minh City, Vietnam";
	   act.clickToElement(prop.getProperty("inputFlyingFrom"));
	   act.sendKeyToElement(prop.getProperty("inputFlyingFrom"), text_01);
	   act.waitForControlVisible(prop.getProperty("DropdownFlying"));
	   act.selectItemInDropdownSpecial(prop.getProperty("DropdownFlying"), "li", Expected);
	   
	   String text_02 = "Ha Noi";
	   String Expected_02 = "Hanoi, Vietnam";
	   act.clickToElement(prop.getProperty("inputFlyingTo"));
	   act.sendKeyToElement(prop.getProperty("inputFlyingTo"), text_02);
	   act.waitForControlVisible(prop.getProperty("DropdownFlying"));
	   act.selectItemInDropdownSpecial(prop.getProperty("DropdownFlying"), "li", Expected_02);
	}

	@When("^Click button Search$")
	public void click_button_Search() throws Throwable {
	    
	}

	@When("^Verify information$")
	public void verify_information() throws Throwable {
	    
	}

	@Then("^locse browser$")
	public void locse_browser() throws Throwable {
	    
	}

}
