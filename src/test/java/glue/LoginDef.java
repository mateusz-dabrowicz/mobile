package glue;

import io.cucumber.java8.En;

public class LoginDef extends BaseDef implements En {

    public LoginDef() {

        When("^I set \"([^\"]*)\" in input$", (String value) ->
            page.login.fillInput(value));

        When("I click on continue button", () ->
            page.login.tapButton());

        Given("^I log in$", () -> {
            page.generic.acceptAlert();
            page.propaganda.clickOnArrow();
            page.propaganda.clickOnArrow();
            page.propaganda.clickOnSignIn();
            page.login.fillInput("mdabrowicz@egnyte.com");
            page.login.tapButton();
            page.login.logInWithDifferentAccountShouldBeVisible();
            page.login.fillInput("asdfasdf");
            page.login.tapButton();
        });

        Then("^button log in with a different account should be visible$", () ->
                page.login.logInWithDifferentAccountShouldBeVisible());
    }
}
