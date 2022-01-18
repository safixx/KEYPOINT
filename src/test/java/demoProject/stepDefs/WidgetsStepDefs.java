package demoProject.stepDefs;

import demoProject.pages.WidgetsPage;
import demoProject.utilities.BrowserUtils;
import demoProject.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class WidgetsStepDefs {

    WidgetsPage widgetsPage=new WidgetsPage();

    Actions actions= new Actions(Driver.get());


     @When("the user hover over the Hover me to see button")
    public void the_user_hover_over_the_Hover_me_to_see_button() {
      actions.moveToElement(widgetsPage.hovermetosee_loc).perform();
      BrowserUtils.waitFor(1);
    }
    @Then("the user verify hover me message.")
    public void the_user_verify_hover_me_message() {
         BrowserUtils.waitFor(5);
         Assert.assertEquals("You hovered over the Button",widgetsPage.hoveredOverbutton_loc.getText());
    }

    @Then("the user hover over the “Hover me to see” text field")
    public void the_user_hover_over_the_Hover_me_to_see_text_field() {
       actions.moveToElement(widgetsPage.hoverTextfield_loc).perform();
       BrowserUtils.waitFor(1);
    }

    @Then("the user verify hover me text message.")
    public void the_user_verify_hover_me_text_message() {
        Assert.assertEquals("You hovered over the text field",widgetsPage.hoveredOverbutton_loc.getText());
    }
}
