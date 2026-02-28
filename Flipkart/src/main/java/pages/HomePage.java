package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By product = By.linkText("Samsung galaxy s6");
    By addToCart = By.linkText("Add to cart");

    public void selectProduct() {
        driver.findElement(product).click();
    }

    public void addProductToCart() {
        driver.findElement(addToCart).click();
        driver.switchTo().alert().accept();
    }
}