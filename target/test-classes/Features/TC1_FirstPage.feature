Feature: Facebok page automation

  Scenario: First page automation
    Given User select to the chrome browser
    When User navigate to the URL
    Then User should verify the message "Facebook helps you connect and share with the people in your life. "

  Scenario Outline: First page automation
    Given User select to the chrome browser
    When User navigate to the URL
    And User enter the value of required fields "<fName>" and "<passWord>"
    Then User click the login button after enter  all the fields

    Examples: 
      | fName      | passWord   |
      | 9497367861 | 8078306861 |

  @Run
  Scenario Outline: First page automation with inavlid credential
    Given User select to the chrome browser
    When User navigate to the URL
    And User enter the value of required fields "<fName>" and "<passWord>"
    Then User click the login button after enter  all the fields

    Examples: 
      | fName      | passWord   |
      | 9497367861 | 8078306863 |
