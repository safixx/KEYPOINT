package demoProject.stepDefs;

import demoProject.pages.AlertPage;
import demoProject.utilities.BrowserUtils;
import demoProject.utilities.ConfigurationReader;
import demoProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class AlertStepDefs {

    AlertPage alertClass = new AlertPage();

    @Given("the user is on the demoqa webpage")
    public void the_user_is_on_the_demoqa_webpage() {
        Driver.get().get(ConfigurationReader.get("url"));
        alertClass.closeFixedban_loc.click();

    }

    @Given("the user clicks {string} module")
    public void the_user_clicks_module(String module) {
        BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath("//h5[.='" + module + "']")), 10);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,250)");
        Driver.get().findElement(By.xpath("//h5[.='" + module + "']")).click();
    }

    @Then("The user clicks the {string} tab")
    public void the_user_clicks_the_tab(String tab) {
        BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath("//span[.='" + tab + "']")), 10);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,250)");
        Driver.get().findElement(By.xpath("//span[.='" + tab + "']")).click();
    }

    @When("the user click AlertButton")
    public void the_user_click_AlertButton() {
        BrowserUtils.waitFor(1);
        alertClass.alertButton_loc.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user verify {string} Alert Message")
    public void the_user_verify_Alert_Message(String expectedMessage) {
        BrowserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        BrowserUtils.waitFor(1);
        Assert.assertEquals("does not match", expectedMessage, alert.getText());
        if (alert.getText().equals("You clicked a button") || alert.getText().equals("This alert appeared after 5 seconds")) {
            alert.accept();
        } else if (alert.getText().equals("Do you confirm action?")) {
            alert.dismiss();
            BrowserUtils.waitFor(1);
            Assert.assertTrue(alertClass.confirmResult_loc.isDisplayed());
            BrowserUtils.waitFor(1);

        }


    }

    @When("the user click timerAlertButton")
    public void the_user_click_timerAlertButton() {
        BrowserUtils.waitFor(1);
        alertClass.timerAlertButton_loc.click();
        BrowserUtils.waitFor(5);

    }

    @When("the user click confirmButton")
    public void the_user_click_confirmButton() {
        BrowserUtils.waitFor(1);
        alertClass.confirmButton_loc.click();
        BrowserUtils.waitFor(1);

    }

    @When("the user click promtButton")
    public void the_user_click_promtButton() {
        BrowserUtils.waitFor(1);
        alertClass.promtButton_loc.click();


    }

    @Then("the user enters name")
    public void the_user_enters_name() {
        BrowserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        alert.sendKeys("Saffet");
        alert.accept();
        BrowserUtils.waitFor(1);
    }

    @Then("the user verify name")
    public void the_user_verify_name() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(alertClass.promptResult_loc.isDisplayed());
    }

}
