package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnHomePage {
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    public WebElement clickReturn;
    public ReturnHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void returnButton(){
        clickReturn.click();
    }
    public  void FillContactInformation(){
        clickReturn.click();
    }


}
