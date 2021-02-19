package com.Swaglabs.steps;

import com.Swaglabs.utils.CommonMethods;
import com.Swaglabs.utils.ConfigsReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.Swaglabs.utils.CommonMethods.sendText;

public class LoginStepDefinition extends CommonMethods {
    @When("user enters valid username")
    public void userEntersValidUsername() {
        sendText(loginPage.userName, ConfigsReader.getProperty("username"));
    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        sendText(loginPage.password, ConfigsReader.getProperty("password"));

    }

    @And("click on login button")
    public void clickOnLoginButton() {
        click(loginPage.loginBtn);
        wait(2);
    }

    @Then("I validate that user is logged in")
    public void iValidateThatUserIsLoggedIn() {
        Assert.assertTrue(mainPage.appLogo.isDisplayed());
    }

    @And("user leaves password empty")
    public void userLeavesPasswordEmpty() {
        sendText(loginPage.password, "");
    }

    @Then("I validate that {string} message is displayed")
    public void iValidateThatMessageIsDisplayed(String expectedMsg) {
        String actualMsg = loginPage.errorMsg.getText();
        Assert.assertEquals("The welcome message is different!!!", expectedMsg, actualMsg);
    }

    @When("user enters invalid username as {string}")
    public void userEntersInvalidUsernameAs(String username) {
        sendText(loginPage.userName, username);
    }

    @And("user enters invalid password as {string}")
    public void userEntersInvalidPasswordAs(String password) {
        sendText(loginPage.password, password);
    }
}
