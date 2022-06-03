Business Need: To have user login functionality
  Scenario: User try to login to zoom website
    Given User has access to "https://zoom.us"
    When User click on signin link and key in username "atin@example.com" and password "2ijsjsjs"
    Then it should display errormessage "Incorrect email or password."
    And error message should also contain "request an email"
