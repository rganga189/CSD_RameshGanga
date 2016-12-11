Feature: Dates with different date formats
  This feature shows you can have different date formats, as long as you annotate the
  corresponding step definition method accordingly.

  Scenario: Determine past date
    Given today is 2016-12-10
    When I ask if Dec 9, 2016 is in the past
    Then the result should be yes
    
    