package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class BasketPage extends Base {

	public void user_add_product_into_the_basket_from_plp_page() {
		
		WebElement addToCartBtn = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack"));
		addToCartBtn.click();
	}

	public void validateBasketCount() {
		WebElement basketCount = driver.findElement(By.cssSelector("span.shopping_cart_badge"));
		String actualCount = basketCount.getText();
		assertEquals("1", actualCount);
	}
	
	public void user_navigate_to_cart_page() {
		WebElement basketIcon =	driver.findElement(By.cssSelector("a.shopping_cart_link"));
		basketIcon.click();
		
		WebElement checkoutBtn =	driver.findElement(By.cssSelector("button#checkout"));
		checkoutBtn.click();
	}
	
}
