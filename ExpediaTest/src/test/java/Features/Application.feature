#Author: Thuan.Nguyen


Feature: Testing with Expedia
  I want to use this template for my feature file

  @tag1
  Scenario: check perform normal
    Given Open init browser
    And Click button Flights
    When Enter information
    And Click button Search
    And Verify information
    Then locse browser


  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
