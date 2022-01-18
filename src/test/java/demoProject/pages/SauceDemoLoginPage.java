package demoProject.pages;

import demoProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage extends BasePage{


        public SauceDemoLoginPage() {

            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(xpath = "//*[@id=\"user-name\"]")
        public WebElement username;

        @FindBy(xpath = "//*[@id=\"password\"]")
        public WebElement password;

        @FindBy(xpath = "//*[@id=\"login-button\"]")
        public WebElement loginBtn;

        @FindBy(xpath = "//div[@class='app_logo']")
        public WebElement headerText;

        public void login(String userName, String passWord) {
            username.sendKeys(userName);
            password.sendKeys(passWord);
            loginBtn.click();

        }
    }


