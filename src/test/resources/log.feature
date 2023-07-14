Feature: Complete the task from RubyNext

  Scenario Outline: Selecting Birthday June 12 2023 Successfully and register
    Given Open the browser
    When Enter date and register <phone> and <password> with <name>
    Then User entered date successfully

    Examples: 
      | phone      | password   | name   |
      | 8888888888 | Name1@1993 | india  |
      | 9999999999 | Name3@1993 | canada |
