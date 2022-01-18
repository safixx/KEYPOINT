package demoProject.stepDefs;

import demoProject.pages.InteractionsPage;
import demoProject.utilities.BrowserUtils;
import demoProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InteractionsStepDefs {

    InteractionsPage interactions= new InteractionsPage();

    @When("The user drag the “drag me” box to the “drop me” box")
    public void the_user_drag_the_drag_me_box_to_the_drop_me_box() {

        Actions actions = new Actions(Driver.get());
        BrowserUtils.waitFor(2);
        actions.clickAndHold(interactions.draggableBox_loc).moveToElement(interactions.droppmeBox_loc).
                release(interactions.droppmeBox_loc).build().perform();

    }

    @Then("The user verify that the box dropped")
    public void the_user_verify_that_the_box_dropped() {

        String expectedText= "Dropped!";
        String actualText= interactions.droppedBox_loc.getText();
        Assert.assertEquals("does not match",expectedText,actualText);
    }


    }




