Feature: An example

  Scenario:TC1 Valid email US
    Given I am on the main page
    When The email value of "fedecutitaru@yahoo.com" is innputed
    And the submit button is clicked
    Then the newsletter pop-up appers

  Scenario:TC2 Valid email RO
    Given I am on the main page
    When The email value of "fedecutitaru@yahoo.ro" is innputed
    And the submit button is clicked
    Then the newsletter pop-up appers


  Scenario:TC3  Negative over character limit
    Given I am on the main page
    When The email value of "aadsscfffdnbdsnmbfmnbsmnbscmnbs,m" is innputed
    And the submit button is clicked
    Then the newsletter pop-up not appers


  Scenario: TC4 Start enrollment
    Given I am on the main page
    When the start the enrollment is clicked
    Then the "Software Testing | Enrollment" page opens
    Then the newsletter pop-up appers

  Scenario: TC5 Question Button
    Given I am on the main page
    When the question button is clicked
    Then the question is expand

  Scenario:TCC6 Selenium button 6
    Given I am on the main page
    When te selenium read more is clicked
    Then the "Selenium" page is not open

  Scenario: TC7 Instagram button
    Given I am on the main page
    When the instagram pictograme is clicked
    Then the Instagram page is open

  Scenario:TC8 Return button
    Given I am on the main page
    When the return button in clicked
    Then i am on the top page

  Scenario: TC9 Return button
    Given I am on the fundamental page
    When the retun button is clicked
    Then is return to main page

  Scenario: TC10 Personal information
    Given I am on the personal information section
    When first name of value of "Laris" is innputed
    And second name of value"Mircea" is innputed
    * user name of value "Vasiloiu" is innputed
    * passowrd of value "abc123" is innputed
    * confirm password of value "abc123" is innputed
    * the next button is clicked
    Then I am taken to the contact information page

    Scenario: TC11 Contact information
      Given I am on the contact information section
      When email of value "laris@gmail.com" is innputed
      * phone number of value "1234567890" is innputed
      * country name value of "Romania" is innputed
      * city name of value "Brasov" is innputed
      * post code of value "500063" is innputed
      * the next second button is clicked
      Then the course option is appear

  Scenario: TC12 Sign Up
    Given I am on the signup section
    When i click on Software Testing - Automation tester certificate
    And the third next button is clicked
    Then i am on sign up section

  Scenario: TC13 Payment Information
    Given I am on the payment page
    When The card name value of "Laris Mircea" is inputed
    And the card number value of "123345456779" is innputed
    * the CVC number value of "123" is innputed
    * i select the expire mounth
    * i select expire year
    * the fourth next button is clicked
    Then registration has been made successfully

  Scenario:TC 14 Return home page
    Given I am on the return page section
    When i click homepage button
    Then i am on the homepage










