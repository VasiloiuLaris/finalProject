package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformation {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardName;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement cardNumber;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cvcNumber;
    @FindBy(xpath = "//*[@id=\"month\"]/option[12]")
    private WebElement selectMounth;
    @FindBy(xpath = "//*[@id=\"year\"]/option[5]")
    private WebElement selectYear;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement fourthNextButton;

    public PaymentInformation(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void inputCardName(String string){
        cardName.sendKeys(string);
    }
    public void inputCardNumber(String string){
        cardNumber.sendKeys(string);
    }
    public void inputCvcNumber(String string){
        cvcNumber.sendKeys(string);
    }
    public void inputMounth(){
        selectMounth.click();
    }
    public void inputYear(){
        selectYear.click();
    }
    public void inputClick(){
        fourthNextButton.click();
    }
    public  void FillContactInformation(){
        inputCardName("Laris Mircea");
        inputCardNumber("1234567898900");
        inputCvcNumber("123");
        inputClick();

    }

}
