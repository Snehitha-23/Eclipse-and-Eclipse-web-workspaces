Feature: LogIn Action Test
Description: This feature will test a LogIn and LogOut functionality    Scenario: Unsuccessful Login with InValid Credentials         Given User is on Home Page         When User Navigate to LogIn Page         And User enters UserName and Password         But The user credentials are wrong         Then Message displayed Wrong UserName & Password

Will test a login and logout
Scenario: Unsuccessful login with invalid credentials
    Given User is on home page
    When user navigates to login page
    And user enter username as "Shalini" and password as "shalu"
    But the user credentials are wrong
    Then message displayed wrong credentials
