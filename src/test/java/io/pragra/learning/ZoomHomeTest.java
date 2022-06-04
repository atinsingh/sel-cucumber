//package io.pragra.learning;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.After;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class ZoomHomeTest {
//    WebDriver webDriver;
//    private final String url = "https://oauth-atin.singh-a7a18:633ea1f2-3d23-4287-9086-b7ab47272db1@ondemand.us-west-1.saucelabs.com:443/wd/hub";
//
//    @Given("User has access to {string}")
//    public void userHasAccessTo(String pageURl) throws MalformedURLException {
//        ChromeOptions capabilities = new ChromeOptions();
//        capabilities.setPlatformName("Windows 10");
//        webDriver =  new RemoteWebDriver(new URL(url), capabilities);
//        webDriver.get(pageURl);
//    }
//
//    @When("User click on signin link and key in username {string} and password {string}")
//    public void userClickOnSigninLinkAndKeyInUsernameAndPassword(String email, String pass) {
//        webDriver.findElement(By.linkText("SIGN IN")).click();
//        webDriver.findElement(By.id("email")).sendKeys(email);
//        webDriver.findElement(By.id("password")).sendKeys(pass);
//        webDriver.findElement(By.cssSelector("#agree-terms+div>button")).click();
//
//    }
//
//    @Then("it should display errormessage {string}")
//    public void itShouldDisplayErrormessage(String arg0) {
//    }
//
//    @And("error message should also contain {string}")
//    public void errorMessageShouldAlsoContain(String arg0) {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        webDriver.quit();
//    }
//
//    @When("user click on contact sales link")
//    public void user_click_on_contact_sales_link() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("it should open contact sales title should be {string}")
//    public void it_should_open_contact_sales_title_should_be(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user should be able enter email as {string}")
//    public void user_should_be_able_enter_email_as(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user should be able enter password as {string}")
//    public void user_should_be_able_enter_password_as(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//}
