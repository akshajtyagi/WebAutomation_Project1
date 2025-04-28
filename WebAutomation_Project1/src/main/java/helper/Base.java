package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	static {
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/resources/env.properties");
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//@Before
	public void setup() {

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//@After
	public void tearDown() {
		driver.quit();

	}

	public void selectByVisibleText(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}

	public void selectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}

	public void selectByIndex(WebElement ele, Integer value) {
		Select s = new Select(ele);
		s.selectByIndex(value);
	}

	public void moveToElement(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
	}

	public void waitForExpectedElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void waitForElementToBeClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void clickByExecutor(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

}
