package org.Tesco_Search.Step_Definetion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.Tesco_Search.Pages.pages;
import org.junit.Assert;

public class SearchSteps extends pages {

    @Given("^User must be on Tesco Website$")
    public void user_must_be_on_Tesco_Website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String url=URL();
        Assert.assertEquals("https://www.tesco.com/",url);
    }


    @When("^User search for \"([^\"]*)\"  on search bar$")
    public void user_search_for_on_search_bar(String pname) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setCookies();
        setSearchBar(pname);
    }

    @When("^User click on Search button$")
    public void user_click_on_Search_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setSearchbutton();
    }
    @Then("^User will able to see the \"([^\"]*)\" on webpage\\.$")
    public void user_will_able_to_see_the_on_webpage(String product) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String ProductActual=Title();
        Assert.assertEquals("Productverify","Results for "+ '“' + product + '”',ProductActual);
    }


}
