package demoProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage extends BasePage {

    @FindBy(xpath = ".show li:nth-of-type(7)")
    public WebElement toolTips_loc;

    @FindBy(xpath = "//button[@id='toolTipButton']")
    public WebElement hovermetosee_loc;

    @FindBy(xpath = "//div[@class='tooltip-inner']")
             public WebElement hoveredOverbutton_loc;

    @FindBy(xpath = "//input[@id='toolTipTextField']")
    public WebElement hoverTextfield_loc;




}
