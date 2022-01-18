package demoProject.stepDefs;

import demoProject.pages.SauceDemoLoginPage;
import demoProject.utilities.BrowserUtils;
import demoProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import demoProject.utilities.ConfigurationReader;
import org.junit.Assert;

public class SauceDemoLoginValidStepDefs {

   SauceDemoLoginPage sauceDemoLoginPage= new SauceDemoLoginPage();
    @Given("The user is on login page")
    public void the_user_is_on_login_page() {

        String url = ConfigurationReader.get("saucedemo_url");
        Driver.get().get(url);
    }


    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        sauceDemoLoginPage.login(username, password);
    }

    @Then("The user should be on the home page")
    public void the_user_should_be_on_the_home_page() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        System.out.println("expectedTitle = " + expectedUrl);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getCurrentUrl());
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(expectedUrl));
    }



}
