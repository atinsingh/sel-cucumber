package io.pragra.learning;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.pragra.learning.domain.Testimonial;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.CoreMatchers.*;

public class CourseInfoTest {
    ValidatableResponse response;
    Response post;
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

    @When("user call end point {string}")
    public void userCallEndPoint(String endpoint) {
        Testimonial testimonial = new Testimonial();
        testimonial.setClientName("Edward");
        testimonial.setClientTitle("CEO");
        testimonial.setClientCompany("Aviva");
        testimonial.setTestimonial("Learning was fun");
        testimonial.setImageUrl("");

        RequestSpecification specs = new RequestSpecBuilder()
                .addHeader("Content-Type", "application/json")
                .setBody(testimonial)
                .build();

        post = RestAssured.given(specs)
                .when().post(endpoint);


    }

    @Then("status code should be {int}")
    public void statusCodeShouldBe(int status) {
        post.then().assertThat().statusCode(status);
        post.then().assertThat().body("clientName", equalTo("Edward"));
    }
}
