#Author: Thuan.Nguyen

Feature: Testing with Expedia
  I want to use this template for my feature file

  Background: open browser and click search
    Given Open init browser
    And Click button Flights

  @tag1
  Scenario: check perform normal
    When Enter information
    And Click button Search
    And Verify information
    Then locse browser

  @tag2
  Scenario: check perform datatable
    When Enter information with datatable
      | Field     | value       | Expected                  |
      | From      | Ho Chi Minh | Ho Chi Minh City, Vietnam |
      | To        | Hanoi       | Hanoi, Vietnam            |
      | departing |          22 |                        22 |
      | return    |          23 |                        23 |
    And Click button Search
    And Verify information with datatable
      | From                            | To                   | Departing  | Returning  |
      | Ho Chi Minh City, Vietnam (SGN) | Hanoi, Vietnam (HAN) | 09/22/2018 | 09/23/2018 |
    Then locse browser

  @tag3
  Scenario Outline: check perform OutLine Examples
    When Enter information "<FlyingFrom>" and "<FlyingTo>"
    And Click button Search
    And Verify information
    Then locse browser

    Examples: 
      | FlyingFrom  | FlyingTo |
      | Ho Chi Minh | Hanoi    |
