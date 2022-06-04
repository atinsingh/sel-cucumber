package io.pragra.learning;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.CoreMatchers.*;

public class CourseInfoTest {
    ValidatableResponse response;
    @Given("User have access to url {string}.")
    public void userHaveAccessToUrl(String url) {
        System.out.println("arg0 = " + url);
        RestAssured.baseURI = url;
    }

    @When("user call end point {string} with id {string}.")
    public void userCallEndPointWithId(String path, String course_id) {
        System.out.println("path = " + path);
        System.out.println("course_id = " + course_id);
         response = RestAssured.given()
                .when()
                .get(path, course_id)
                .then();

    }

    @Then("status code should be {int}.")
    public void status_code_should_be(Integer status) {
        System.out.println("status = " + status);
        response.assertThat().statusCode(status);
    }

    @And("it should have content type {string}.")
    public void itShouldHaveContentType(String arg0) {
        response.assertThat().header("Content-Type", arg0);
    }

    @And("course name shoud be {string}.")
    public void courseNameShoudBe(String name) {
        response.assertThat().body("courseName", equalTo(name));
    }

    @And("course code shoudl be {string}.")
    public void courseCodeShoudlBe(String code) {
        response.assertThat().body("courseCode", equalTo(code));
    }

    @And("Intrctor count should be {int}.")
    public void intrctorCountShouldBe(int count) {
        response.assertThat().body("instructor[0].name", equalTo("Vivek Chaudhary") );
    }
}
