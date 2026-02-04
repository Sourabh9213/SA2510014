Feature: Google Title

  Scenario: To Validate title of Google
    Given Open Google
    When Capture the title
    Then title should be Google
