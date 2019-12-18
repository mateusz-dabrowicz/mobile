Feature: User login to app

  Scenario: User log in to app
    Given I accept alert
     And I should se "Access all your files on the go" on propaganda page
    When I click left arrow on propaganda
    Then I should se "Seamlessly access files without network connectivity" on propaganda page
    When I click left arrow on propaganda
    Then I should se "Dynamically collaborate across teams, offices and partners" on propaganda page
    When I click on Sign In on propaganda page
     And I set "calabash.power+123@gmail.com" in input
     And I click on continue button
    Then button log in with a different account should be visible
    When I set "asdfasdf" in input
     And I click on continue button
    Then title "Qandroid File Server" should be visible
