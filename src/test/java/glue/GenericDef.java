package glue;

import io.cucumber.java8.En;

public class GenericDef extends BaseDef implements En {

    public GenericDef() {

        When("^I accept alert$", () ->
                page.generic.acceptAlert());

        Then("^title \"([^\"]*)\" should be visible$", (String title) ->
                page.root.titleShouldBe(title));

        And("^I select \"([^\"]*)\"$", (String date) -> {
            String[] a = date.split(" ");
            page.share.setDay(a[0])
                    .setMonth(a[1])
                    .setYear(a[2]);
        });
    }
}
