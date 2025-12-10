package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {

    WebDriver driver;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        driver = new ChromeDriver();
    }

    @When("I open Google")
    public void i_open_google() {
        driver.get("https://www.google.com");
    }

    @Then("the page title should contain {string}")
    public void the_page_title_should_contain(String title) {
        Assert.assertTrue(driver.getTitle().contains(title));
        driver.quit();
    }
}
