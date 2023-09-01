package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundamentalPage {
    @FindBy (xpath ="/html/body/a")
    public WebElement returnButton;


    public FundamentalPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void theReturnButton(){
        returnButton.click();
    }
}
