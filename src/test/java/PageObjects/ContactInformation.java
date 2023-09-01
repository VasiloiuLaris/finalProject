package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformation {
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement inputEmail;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumber;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement setCountry;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement setCity;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactHeader;

    public ContactInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void emailInput(String string) {
        inputEmail.sendKeys(string);
    }

    public void inputPhoneNumber(String string) {
        phoneNumber.sendKeys(string);
    }

    public void inputCountry(String string) {
        setCountry.sendKeys(string);
    }

    public void inputCity(String string) {
        setCity.sendKeys(string);
    }

    public void inputPostCode(String string) {
        postCode.sendKeys(string);
    }

    public void clickNextButtonsecond() {
        nextButton.click();
    }

    public String getContactHeaderText() {
        return contactHeader.getText();
    }
    public  void FillContactInformation(){
        emailInput("larisvasiloiu@gmail.com");
        inputPhoneNumber("1234567890");
        inputCountry("Romania");
        inputCity("Brasov");
        inputPostCode("500034");
        clickNextButtonsecond();

    }
}
