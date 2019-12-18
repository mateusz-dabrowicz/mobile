package glue;

import io.cucumber.java8.En;

public class FoldersTree  extends BaseDef implements En {

    public FoldersTree(){

        When("^I click on my private folder$", () ->
                page.folderTree.clickOnElement("mdabrowicz"));

        And("^I click on file \"([^\"]*)\"$", (String item) ->
                page.folderTree.clickOnElement(item));

        And("^I click on file \"([^\"]*)\" hamburger$", (String item) ->
                page.folderTree.clickOnHamburger(item));

        And("^I select folder action \"([^\"]*)\"$", (String action) ->
                page.fileActions.clickOnElementByName(action));

        And("^I click on \"([^\"]*)\" in share$", (String option) ->
                page.share.clickOnElementByName(option));
    }
}
