package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement clickOnReadMore;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement clickStart;

    @FindBy(xpath ="/html/body/section[3]/div/div/div[1]/div/div")
    private WebElement scrollToVirtualHeader;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement clickQuestionButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement clickHybrydRead;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement clickSelenium;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[2]")
    private WebElement seleniumHeader;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[4]/i")
    WebElement clickInsta;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/img")
    private WebElement instaHeader;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement returnButton;

    @FindBy(xpath = "/html/body/section[8]/div/div/div[1]/ul/li[5]")
    private WebElement returnHeader;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void inputValueInField(String string){
        inputEmailField.sendKeys(string);
    }

    public void clickOnSubmitButton(){
        elementSubmitButton.click();
    }

    public void clickReadMore(){
        clickOnReadMore.click();
    }
    public void clicOnStart(){
        clickStart.click();
    }

    public void clickOnQuestions(){clickQuestionButton.click();}

    public void clickSelenium(){
        clickSelenium.click();
    }
    public WebElement getSeleniumHeader() {
        return seleniumHeader;
    }
    public void clickOnInsta(){
        clickInsta.click();
    }
    public WebElement getInstaHeader(){
        return instaHeader;
    }
    public void clickOnReturnButton(){
        returnButton.click();
    }
    public WebElement getReturnButton(){
        return returnHeader;
    }

}
