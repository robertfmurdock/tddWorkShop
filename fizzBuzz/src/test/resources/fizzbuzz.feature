Feature: Depositing money in to a User account
  Scenario Outline: eating
    Given Fizzbuzz exists
    When the number is <number>
    Then the result should be <result>

  Examples:
    | number | result |
    |  1     |  1     |
    |  2     |  2     |
    |  3     |  Fizz  |