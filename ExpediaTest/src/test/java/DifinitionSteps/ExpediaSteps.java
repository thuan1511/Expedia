package DifinitionSteps;

import java.io.IOException;
import java.util.List;

import TestActions.Actions;
import TestBases.TestBase;
import cucumber.api.DataTable;
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

		String text_02 = "Ha";
		String Expected_02 = "Hanoi, Vietnam";
		act.clickToElement(prop.getProperty("inputFlyingTo"));
		act.sendKeyToElement(prop.getProperty("inputFlyingTo"), text_02);
		act.waitForControlVisible(prop.getProperty("DropdownFlying"));
		act.selectItemInDropdownSpecial(prop.getProperty("DropdownFlying"), "li", Expected_02);

		String value = "22";
		String expected_03 = "22";
		act.clickToElement(prop.getProperty("inputDeparting"));
		act.sendKeyToElement(prop.getProperty("inputDeparting"), value);
		act.waitForControlVisible(prop.getProperty("btnCalendar"));
		act.selectItemInDropdownSpecial(prop.getProperty("btnCalendar"), "td", expected_03);

		String value2 = "23";
		String expected_04 = "23";
		act.clickToElement(prop.getProperty("inputReturn"));
		act.sendKeyToElement(prop.getProperty("inputReturn"), value2);
		act.waitForControlVisible(prop.getProperty("btn2Calendar"));
		act.selectItemInDropdownSpecial(prop.getProperty("btn2Calendar"), "td", expected_04);
	}

	@When("^Click button Search$")
	public void click_button_Search() throws Throwable {

		act.clickToElement(prop.getProperty("btnSearch"));
		Thread.sleep(4000);

	}

	@When("^Verify information$")
	public void verify_information() throws Throwable {

		// FlyingFrom
		String Expected_01 = "Ho Chi Minh City, Vietnam (SGN)";
		act.waitForControlVisible(prop.getProperty("inputResult01"));
		String Actual_01 = act.getAttribute01(prop.getProperty("inputResult01"));
		System.out.println(Actual_01);
		act.verifyEquals(Expected_01, Actual_01);

		// FlyingTo
		String Expected_02 = "Hanoi, Vietnam (HAN)";
		act.waitForControlVisible(prop.getProperty("inputResult02"));
		String Actual_02 = act.getAttribute01(prop.getProperty("inputResult02"));
		System.out.println(Actual_02);
		act.verifyEquals(Expected_02, Actual_02);

		// Calendar from
		String Expected_03 = "09/22/2018";
		act.waitForControlVisible(prop.getProperty("Calendar01"));
		String Actual_03 = act.getAttribute01(prop.getProperty("Calendar01"));
		System.out.println(Actual_03);
		act.verifyEquals(Expected_03, Actual_03);

		// Calendar To
		String Expected_04 = "09/23/2018";
		act.waitForControlVisible(prop.getProperty("Calendar02"));
		String Actual_04 = act.getAttribute01(prop.getProperty("Calendar02"));
		System.out.println(Actual_04);
		act.verifyEquals(Expected_04, Actual_04);

	}

	@When("^Enter information with datatable$")
	public void enter_information_with_datatable(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();

		String text_01 = data.get(1).get(1);
		String Expected = data.get(1).get(2);
		act.clickToElement(prop.getProperty("inputFlyingFrom"));
		act.sendKeyToElement(prop.getProperty("inputFlyingFrom"), text_01);
		act.waitForControlVisible(prop.getProperty("DropdownFlying"));
		act.selectItemInDropdownSpecial(prop.getProperty("DropdownFlying"), "li", Expected);

		String text_02 = data.get(2).get(1);
		String Expected_02 = data.get(2).get(2);
		act.clickToElement(prop.getProperty("inputFlyingTo"));
		act.sendKeyToElement(prop.getProperty("inputFlyingTo"), text_02);
		act.waitForControlVisible(prop.getProperty("DropdownFlying"));
		act.selectItemInDropdownSpecial(prop.getProperty("DropdownFlying"), "li", Expected_02);

		// String value = "22";
		String expected_03 = data.get(3).get(2);
		act.clickToElement(prop.getProperty("inputDeparting"));
		// act.sendKeyToElement(prop.getProperty("inputDeparting"), value);
		act.waitForControlVisible(prop.getProperty("btnCalendar"));
		act.selectItemInDropdownSpecial(prop.getProperty("btnCalendar"), "td", expected_03);

		// String value2 = "23";
		String expected_04 = data.get(4).get(2);
		act.clickToElement(prop.getProperty("inputReturn"));
		// act.sendKeyToElement(prop.getProperty("inputReturn"), value2);
		act.waitForControlVisible(prop.getProperty("btn2Calendar"));
		act.selectItemInDropdownSpecial(prop.getProperty("btn2Calendar"), "td", expected_04);
	}

	@When("^Verify information with datatable$")
	public void verify_information_with_datatable(DataTable arg1) throws Throwable {
		List<List<String>> dataTable = arg1.raw();

		String Expected_01 = dataTable.get(1).get(0);
		act.waitForControlVisible(prop.getProperty("inputResult01"));
		String Actual_01 = act.getAttribute01(prop.getProperty("inputResult01"));
		System.out.println(Actual_01);
		act.verifyEquals(Expected_01, Actual_01);

		// FlyingTo
		String Expected_02 = dataTable.get(1).get(1);
		act.waitForControlVisible(prop.getProperty("inputResult02"));
		String Actual_02 = act.getAttribute01(prop.getProperty("inputResult02"));
		System.out.println(Actual_02);
		act.verifyEquals(Expected_02, Actual_02);

		// Calendar from
		String Expected_03 = dataTable.get(1).get(2);
		act.waitForControlVisible(prop.getProperty("Calendar01"));
		String Actual_03 = act.getAttribute01(prop.getProperty("Calendar01"));
		System.out.println(Actual_03);
		act.verifyEquals(Expected_03, Actual_03);

		// Calendar To
		String Expected_04 = dataTable.get(1).get(3);
		act.waitForControlVisible(prop.getProperty("Calendar02"));
		String Actual_04 = act.getAttribute01(prop.getProperty("Calendar02"));
		System.out.println(Actual_04);
		act.verifyEquals(Expected_04, Actual_04);

	}

	@When("^Enter information \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_information_and(String FlyingFrom, String FlyingTo) throws Throwable {

		String Expected = "Ho Chi Minh City, Vietnam";
		act.clickToElement(prop.getProperty("inputFlyingFrom"));
		act.sendKeyToElement(prop.getProperty("inputFlyingFrom"), FlyingFrom);
		act.waitForControlVisible(prop.getProperty("DropdownFlying"));
		act.selectItemInDropdownSpecial(prop.getProperty("DropdownFlying"), "li", Expected);

		String Expected_02 = "Hanoi, Vietnam";
		act.clickToElement(prop.getProperty("inputFlyingTo"));
		act.sendKeyToElement(prop.getProperty("inputFlyingTo"), FlyingTo);
		act.waitForControlVisible(prop.getProperty("DropdownFlying"));
		act.selectItemInDropdownSpecial(prop.getProperty("DropdownFlying"), "li", Expected_02);

		String expected_03 = "22";
		act.clickToElement(prop.getProperty("inputDeparting"));
		act.waitForControlVisible(prop.getProperty("btnCalendar"));
		act.selectItemInDropdownSpecial(prop.getProperty("btnCalendar"), "td", expected_03);

		String expected_04 = "23";
		act.clickToElement(prop.getProperty("inputReturn"));
		act.waitForControlVisible(prop.getProperty("btn2Calendar"));
		act.selectItemInDropdownSpecial(prop.getProperty("btn2Calendar"), "td", expected_04);

	}

	@Then("^locse browser$")
	public void locse_browser() throws Throwable {
		act.CloseBrowser();
	}

}
