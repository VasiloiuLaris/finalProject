package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
    @FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
    private WebElement clickAutomationTeaster;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement clickThirdNextButton;

    public SignUp(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void clickOnAutomationSoftwere(){
        clickAutomationTeaster.click();
    }
    public void setClickThirdNextButton(){
        clickThirdNextButton.click();
    }
    public void FillSignUpField(){
        clickOnAutomationSoftwere();
        setClickThirdNextButton();
    }
}
