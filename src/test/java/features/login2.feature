Feature: Login2 feature Orange HRM Login Functionality

  Scenario: Login Sould be Successful
    Given User Land into Login Page
    And User Enter the Username <"Admin">
    And User Enter the Password <"admin123">
    When User clicks on Login button
    Then <"Dashboard"> should be displayed