Feature: Test Course Info API
  Scenario Outline:
    Given User have access to url "https://app.pragra.io".
    When user call end point "/api/course-info/{id}" with id "<course_id>".
    Then status code should be <status_code>.
    And it should have content type "application/json; charset=utf-8".
    Examples:
      | course_id | status_code |
      | 6116c308df858e6d5ed1507b | 200 |
      | kahs89i | 400 |


  Scenario:
    Given User have access to url "https://app.pragra.io".
    When user call end point "/api/course-info/{id}" with id "6116c308df858e6d5ed1507b".
    Then status code should be 200.
    And course name shoud be "FullStack - Java".
    And course code shoudl be "JAVA-FULL".
    And Intrctor count should be 3.