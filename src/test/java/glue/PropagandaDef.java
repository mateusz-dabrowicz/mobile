package glue;

import io.cucumber.java8.En;

public class PropagandaDef extends BaseDef implements En {

    public PropagandaDef(){
        When("I click left arrow on propaganda", () -> {
           page.propaganda.clickOnArrow();
        });

        Then("^I should se \"([^\"]*)\" on propaganda page$", (String text) ->
            page.propaganda.textShouldBeVisible(text));

        When("I click on Sign In on propaganda page", () ->
            page.propaganda.clickOnSignIn());
    }
}
