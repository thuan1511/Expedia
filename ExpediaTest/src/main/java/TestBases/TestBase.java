package TestBases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\TestConfigs\\Application.properties");
		prop.load(fis);
	}
	
	public static void initBrowser() {
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome") || browser.equals("")) {
			ChromeDriverManager.getInstance().version("2.41").setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extendsions");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefow")) {
			FirefoxDriverManager.getInstance().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		String URL = prop.getProperty("applicationURL");
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

}
