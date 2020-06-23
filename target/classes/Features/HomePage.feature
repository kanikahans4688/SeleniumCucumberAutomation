Feature: WordPress Homepage

  Scenario Outline: HomePage validation
    Given I want launch the browser
    When I login
    Then I click on userbutton
    Then I enter the details "<userid>" and "<mail>" and "<firstname>" and"<lastname>" 
    Then I click on add new user button
    Then I quit the browser

    Examples: 
      | userid | mail          | firstname | lastname |
      | Tom    | tom79@xyz.com | Tom       | Henry    | 
