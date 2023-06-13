package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CashwiseHomePage {

    public CashwiseHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//button[.='Sign up']")
    public WebElement signUpButton;


    @FindBy(xpath = "(//button[.='Sign up'])[2]")
    public WebElement signUpButton2;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactNameInput;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement contactPhoneInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement contactEmailInput;

    @FindBy(xpath = "//button[.='Send']")
    public WebElement sendBtn;

    @FindBy(xpath = "//div[@type='MINI']//h2")
    public WebElement contactSubmittedPopup;

    @FindBy(xpath = "//div[@class='App']/div[1]/div[1]/div[2]/div")
    public WebElement languageOptionsBtn;


    @FindBy(xpath = "//ul/li")
    public List<WebElement> languageOptions;






}
