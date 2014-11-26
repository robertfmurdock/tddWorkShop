Feature: Fizzing must be appropriately buzzy.
  Scenario Outline: In which our hero buzzes, after fizzing.
    Given Fizzbuzz exists
    When the number is <number>
    Then the result should be <result>

  Examples:
    | number | result  |
    |  1     | 1       |
    |  2     | 2       |
    |  3     | Fizz    |
    |  4     | 4       |
    |  5     | Buzz    |
    |  15    | FizzBuzz|