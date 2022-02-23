package pageObject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoChart {
    @Test
    public void AddChart() {

    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    String URL = "https://www.saucedemo.com";
    driver.get(URL);

    // login
    WebDriverWait wait = new WebDriverWait(driver, 3);
    WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
    username.sendKeys("standard_user");
    WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
    password.sendKeys("secret_sauce");
    // submit
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        submit.submit();

    // add to chart
        WebElement elementAdd = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")));
        elementAdd.click();
    }
}

