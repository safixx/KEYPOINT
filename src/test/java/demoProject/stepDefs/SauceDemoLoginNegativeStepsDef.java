package demoProject.stepDefs;

import demoProject.pages.BasePage;
import demoProject.pages.SauceDemoLoginPage;
import demoProject.utilities.BrowserUtils;
import demoProject.utilities.ConfigurationReader;
import demoProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SauceDemoLoginNegativeStepsDef extends BasePage{


        SauceDemoLoginPage  sauceDemoLoginPage= new SauceDemoLoginPage();

        @Given("the user is on the login page")
        public void the_user_is_on_the_login_page() {
            String url = ConfigurationReader.get("saucedemo_url");
            Driver.get().get(url);

        }

        @When("the user enters by using {string} and {string}")
        public void the_user_enters_by_using_and(String Username, String Password) {
            sauceDemoLoginPage.login(Username, Password);
        }

        @Then("the should not be on home page")
        public void the_should_not_be_on_home_page() {

            String expectedUrl = "https://www.saucedemo.com/inventory.html";
            System.out.println("expectedTitle = " + expectedUrl);
            System.out.println("Driver.get().getCurrentUrl() = " + Driver.get().getCurrentUrl());
            BrowserUtils.waitFor(2);
            Assert.assertFalse(Driver.get().getCurrentUrl().contains(expectedUrl));

        }

    }



