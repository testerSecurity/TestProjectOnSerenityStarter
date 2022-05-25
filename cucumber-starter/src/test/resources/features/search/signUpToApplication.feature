@tag
Feature: SignUp or Registration into LTS site
  I want to use this template for my feature file

  @tag1
  Scenario: Sign Up for a new user
    Given User opens browser
    When The user navigate to the URL "https://exppackage.shiptobox.com/registration"
    And Select country from drop-down menu 
    And The user need to enter valid and unique email
    And The user need to enter first name at least 2 characters
    And The user need to enter last name at least 2 characters
    Then The user need to enter password at least 8 characters
    And The user need to marked the checklist for agree with terms and policy
    And The user clicks on create account button
    Then The user must register to the LTS account successfully 

  #@tag2
  #Scenario: Login with valid credentail of LTS Project
    #Given User opens the browser
    #When The user navigate to the EXP Express URL "https://exppackage.shiptobox.com/user/login"
    #And The user enter correct email and password
    #And The user clicks on login button
    #Then The user must login to the LTS account successfully