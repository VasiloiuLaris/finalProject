package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {
    @FindBy (xpath = "//*[@id=\"firstName\"]")
    private WebElement nameInput;
    @FindBy (xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;
    @FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement usernameInput;
    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement passwordInput;
    @FindBy (xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    public PersonalInformation (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void inputFirstName(String string){
        nameInput.sendKeys(string);
    }
    public void inputLastName(String string){
        lastName.sendKeys(string);
    }
    public void inputUsername(String string){
        usernameInput.sendKeys(string);
    }
    public void inputPasswordInput(String string){
        passwordInput.sendKeys(string);
    }
    public void inputConfirmPassword(String string){
        confirmPassword.sendKeys(string);
    }
    public void clickNextButton(){
        nextButton.click();

    }
    public  void FillInformationPersonal(){
        inputFirstName("Laris");
        inputLastName("Mircea");
        inputUsername("Vasiloiu");
        inputPasswordInput("abc123");
        inputConfirmPassword("abc123");
        clickNextButton();
    }


}
