package demoProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractionsPage extends BasePage{

    @FindBy(id="draggable")
    public WebElement draggableBox_loc;

    @FindBy(xpath = "(//div[@id='droppable'])[1]")
    public WebElement droppmeBox_loc;

    @FindBy(xpath = "//p[.='Dropped!']")
    public WebElement droppedBox_loc;



}
