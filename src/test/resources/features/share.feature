Feature: Share link

  Scenario: User create share link
    Given I log in
    When I click on my private folder
     And I click on file "Elo" hamburger
     And I select folder action "Share"
     And I click on "Link options" in share
     And I select "13 July 2022"

