 Feature: Login
 
  Scenario Outline: Login with Valid Credentials
    Given user is on loginpage
    When enter valid <username> and <password>
    and clicked on login 
    Then home page is displayed

    Examples: 
      |username|password|
      |pallavi|pallavi12|