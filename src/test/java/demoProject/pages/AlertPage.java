package demoProject.pages;


import demoProject.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{


    @FindBy(xpath = "//button[@id='alertButton']")
    public WebElement alertButton_loc;
    @FindBy(xpath = "//button[@id='timerAlertButton']")
    public WebElement timerAlertButton_loc;
    @FindBy(xpath = "//button[@id='confirmButton']")
    public WebElement confirmButton_loc;
    @FindBy(xpath = "//button[@id='promtButton']")
    public WebElement promtButton_loc;
    @FindBy (xpath = "//span[@id='promptResult']")
    public WebElement promptResult_loc;
    @FindBy(xpath = "//*[@id='close-fixedban']")
    public  WebElement closeFixedban_loc;
    @FindBy(xpath = "//span[@id='confirmResult']")
    public WebElement confirmResult_loc;

















}


