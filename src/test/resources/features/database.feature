Feature: training scenarios

  Scenario: Save API people into DB and log all
    Given I get 3 random person from API as "crowd2"
    When I store "crowd2" to Person table
    Given I choose a one random person from DB as "random_person"