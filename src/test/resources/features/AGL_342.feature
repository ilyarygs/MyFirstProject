@AGL-412
Feature: AGILEPROCRM app Drive function
  User Story:
  As a user, I should be able to use Calendar function

  @AGL-410
  Scenario Outline: User should be able to display "My Calendar" window by clicking "Calendar" tab
    Given User is already with "<username>" and "<password>" logged in and on Activity Stream page
    When User clicks Calendar tab
    Then User should be able to see title is "Calendar"

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | marketing2@cybertekschool.com | UserUser |
      | marketing3@cybertekschool.com | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | helpdesk2@cybertekschool.com  | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |

  @AGL-411
  Scenario Outline: User should be able to display "Company calendar" window by clicking "Company Calendar" tab
    Given User is already with "<username>" and "<password>" logged in and on Activity Stream page
    When User clicks Calendar tab
    And User clicks Company Calendar tab
    Then User should be able to display "Event Calendar" window
    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | marketing2@cybertekschool.com | UserUser |
      | marketing3@cybertekschool.com | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | helpdesk2@cybertekschool.com  | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |