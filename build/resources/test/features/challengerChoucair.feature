# Autor: Sebastian
@stories
Feature: Challenge Choucair
  As a user, I will register on the uTest site
  @scenario1
  Scenario: search the uTest site
    Given that sebas know wants to register on the Utest site
      | strFirsname    | strLastname   | strEmail            | strMonth   | strDay    | strYear  |
      | Sebastian      | Mendoza       | sebmenca3@gmail.com | September  | 30        | 1993     |
    When he find where is the registration form in Utest
    Then user registers