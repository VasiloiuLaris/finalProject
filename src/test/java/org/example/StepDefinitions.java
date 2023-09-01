package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {

    private WebDriver driver;

    ChromeOptions options = new ChromeOptions();
    MainPage mainPage;
    FundamentalPage fundamentalPage;
    PersonalInformation personalInformation;
    ContactInformation contactInformation;
    SignUp signUp;
    PaymentInformation paymentInformation;
    ReturnHomePage returnHomePage;





    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        fundamentalPage = new FundamentalPage(driver);
        personalInformation = new PersonalInformation(driver);
        contactInformation = new ContactInformation(driver);
        signUp = new SignUp(driver);
        paymentInformation = new PaymentInformation(driver);
        returnHomePage = new ReturnHomePage(driver);

    }
    @Given("I am on the return page section")
    public void return_to_main_page(){
        driver.get("file:///Users/vasiloiularis/Downloads/Testing-Env-master/routes/enrollment.html");
        personalInformation.FillInformationPersonal();
        contactInformation.FillContactInformation();
        signUp.FillSignUpField();
        paymentInformation.FillContactInformation();
    }
    @Given("I am on the payment page")
    public void payment_page_section(){
        driver.get("file:///Users/vasiloiularis/Downloads/Testing-Env-master/routes/enrollment.html");
        personalInformation.FillInformationPersonal();
        contactInformation.FillContactInformation();
        signUp.FillSignUpField();
    }
    @Given("I am on the signup section")
    public void i_am_on_signup_section(){
        driver.get("file:///Users/vasiloiularis/Downloads/Testing-Env-master/routes/enrollment.html");
        personalInformation.FillInformationPersonal();
        contactInformation.FillContactInformation();




    }
    @Given("I am on the contact information section")
    public void i_am_on_the_contact_section(){
        driver.get("file:///Users/vasiloiularis/Downloads/Testing-Env-master/routes/enrollment.html");
        personalInformation.FillInformationPersonal();
    }

    @Given("I am on the personal information section")
    public void i_am_on_the_personal_information_section(){
        driver.get("file:///Users/vasiloiularis/Downloads/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am on the main page")
    public void i_am_on_the_maine_page() {
        driver.get("file:///Users/vasiloiularis/Downloads/Testing-Env-master/index.html");
    }
    @Given("I am on the fundamental page")
    public void i_am_on_fundametal_page(){
        driver.get("file:///Users/vasiloiularis/Downloads/Testing-Env-master/routes/fundamentals.html");
    }
    @When("i click homepage button")
    public void homepage_button(){
        returnHomePage.returnButton();
    }
    @When("The card name value of {string} is inputed")
    public void card_name_value(String string){
        paymentInformation.inputCardName(string);
    }


    @When("The email value of {string} is innputed")
    public void input_email_to_field(String string) {
        mainPage.inputValueInField(string);

    }

    @When("the read more button is clicked on virtual section")
    public void click_read_more_button() {
        Utils.scrollToElement(driver, mainPage.getSeleniumHeader());
        mainPage.clickReadMore();
    }
    @When("i click on Software Testing - Automation tester certificate")
    public void click_software_testing_button(){signUp.clickOnAutomationSoftwere();}

    @When("the start the enrollment is clicked")
    public void click_start_button() {
        mainPage.clicOnStart();
    }


    @When("the submit button is clicked")
    public void click_submit_button() {
        mainPage.clickOnSubmitButton();

    }

    @When("the question button is clicked")
    public void click_question_button() {
        mainPage.clickOnQuestions();
    }
    @When("te selenium read more is clicked")
    public void click_selenium_read_more(){
        Utils.scrollToElement(driver,mainPage.getSeleniumHeader());
        mainPage.clickSelenium();

}
    @When("the instagram pictograme is clicked")
    public void click_insta_pictogram(){
        Utils.scrollToElement(driver,mainPage.getInstaHeader());
        mainPage.clickOnInsta();
    }
    @When("the return button in clicked")
    public void click_return_button(){
        Utils.scrollToElement(driver,mainPage.getReturnButton());
        mainPage.clickOnReturnButton();
    }
    @When("the retun button is clicked")
    public void click_Return_Button(){
        fundamentalPage.theReturnButton();
    }
    @When("first name of value of {string} is innputed")
    public void input_first_value(String string){
        personalInformation.inputFirstName(string);

    }
    @When("email of value {string} is innputed")
    public void input_email(String string){
        contactInformation.emailInput(string);
    }
    @And("phone number of value {string} is innputed")
    public void input_phone_number(String string){
        contactInformation.inputPhoneNumber(string);
    }
    @And("country name value of {string} is innputed")
    public void input_country(String string){
        contactInformation.inputCountry(string);
    }
    @And("city name of value {string} is innputed")
    public void  input_city(String string){
        contactInformation.inputCity(string);
    }
    @And("post code of value {string} is innputed")
    public void input_post_code(String string){
        contactInformation.inputPostCode(string);
    }
    @And("second name of value{string} is innputed")
    public void input_second_name(String string){
        personalInformation.inputLastName(string);

    }
    @And("the card number value of {string} is innputed")
    public void input_card_number(String string){
        paymentInformation.inputCardNumber(string);
    }
    @And("the CVC number value of {string} is innputed")
    public void input_cvc_number(String string){
        paymentInformation.inputCvcNumber(string);
    }
    @And("i select the expire mounth")
    public void select_mounth(){
        paymentInformation.inputMounth();
    }
    @And("i select expire year")
    public void select_year(){
        paymentInformation.inputYear();
    }
    @And("user name of value {string} is innputed")
    public void input_username(String string){
        personalInformation.inputUsername(string);
    }
    @And("passowrd of value {string} is innputed")
    public void  input_password(String string){
        personalInformation.inputPasswordInput(string);
    }
    @And("confirm password of value {string} is innputed")
    public void input_confirmation_password(String string){
        personalInformation.inputConfirmPassword(string);
    }
    @And("the third next button is clicked")
    public void third_next_button(){
        signUp.setClickThirdNextButton();
    }
    @Then("the next button is clicked")
    public void next_button_clicked(){
        personalInformation.clickNextButton();

    }
    @And("the next second button is clicked")
    public void next_button_click(){
        contactInformation.clickNextButtonsecond();
        }
    @Then("the fourth next button is clicked")
    public void fouth_next_button(){
        paymentInformation.inputClick();
    }


    @Then("the newsletter pop-up appers")
    public void theNewsletterPopUpAppers() {
        driver.switchTo().alert().accept();
    }


    @Then("the {string} page opens")
    public void thePageOpens(String arg0) {
        Assertions.assertEquals(arg0, driver.getTitle());
    }

    @Then("I am taken to the contact information page")
    public void iAmTakenToTheContactInformationPage() {
        Assertions.assertEquals("Contact information", contactInformation.getContactHeaderText());
    }

    @Then("the newsletter pop-up not appers")
    public void theNewsletterPopUpNotAppers() {
        Assertions.assertTrue(driver.getPageSource().contains("error"));
    }

    @Then("the question is expand")
    public void theQuestionIsExpand() {
        Assertions.assertTrue(driver.getPageSource().contains("show"));
    }

    @Then("the {string} page is not open")
    public void theSeleniumPageIsNotOpen(String string) {
        Assertions.assertEquals("Learn Selenium",driver.getTitle());
    }

    @Then("the Instagram page is open")
    public void theInstagramPageIsOpen() {
        Assertions.assertEquals("Instagram",driver.getTitle());
    }

    @Then("i am on the top page")
    public void iAmOnTheTopPage() {
        Assertions.assertEquals("Software Testing Course",driver.getTitle());
    }

    @Then("is return to main page")
    public void isReturnToMainPage() {
        Assertions.assertEquals("Software Testing Course",driver.getTitle());
    }

    @Then("i am on sign up section")
    public void iAmOnSignUpSection() {
        Assertions.assertEquals("Software Testing | Enrollment", driver.getTitle());
    }

    @Then("registration has been made successfully")
    public void registrationHasBeenMadeSuccessfully() {
        Assertions.assertEquals("Software Testing | Enrollment",driver.getTitle());
    }

    @Then("i am on the homepage")
    public void iAmOnTheHomepage() {
        Assertions.assertEquals("Software Testing Course",driver.getTitle());
    }

    @Then("the course option is appear")
    public void theCourseOptionIsAppear() {
        Assertions.assertEquals("Software Testing Course",driver.getTitle());

    }
}







        // @After
   // public void cleanUp(){
       // driver.quit();





