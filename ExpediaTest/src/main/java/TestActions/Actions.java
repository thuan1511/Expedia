package TestActions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBases.TestBase;

public class Actions extends TestBase {

	public Actions() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int timeouts = 20;

	// Web Browser
	public void openUrl(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}

	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}

	public void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void waitForIEBrowser(int Timeouts) {
		try {
			Thread.sleep(Timeouts);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Web Element
	public void clickToElement( String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}


	// Clear and sendkey
	public void sendKeyToElement(String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);
	}


	public void selectItemInDropdownSpecial(String locatorDropdown, String tagName, String value) {
		WebElement parent = driver.findElement(By.xpath(locatorDropdown));
		List<WebElement> list = parent.findElements(By.tagName(tagName));
		for (WebElement element : list) {
			if (element.getText().contains(value)) {
				element.click();
				break;
			}
		}

	}

	

	// Javascript

	public void highlightElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='6px groove red'", element);
	}

	

	// Wait
	public void waitForControlVisible(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}




	public boolean verifyEquals(Object actual, Object expected) {
		return verifyEquals(actual, expected);
	}

}
