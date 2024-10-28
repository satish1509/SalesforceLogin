package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sign {
    WebDriver driver;

    @Given("url opened")
    public void url_opened() {
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
    }

    @When("enter user id and password")
    public void enter_user_id_and_click_next() {
    	driver.findElement(By.id("username")).sendKeys("saikumarhg5472@gmail.com");
    	driver.findElement(By.id("password")).sendKeys("Tb4H8Ht1@");
 }

    @And("click login")
    public void click_login() {
        driver.findElement(By.id("Login")).click();
    }

    @Then("user should navigate to setup page")
    public void close_browser() {
        driver.quit();
    }
}
