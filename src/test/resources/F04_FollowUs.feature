Feature: verify follow us button works properly
  Scenario: user follow social media pages
    Given user is on home page
    When user clicks on facebook button
    Then user clicks on twitter button
    Then user clicks on rss button
    Then user clicks on youtube page

