package org.Tesco_Search.Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.Tesco_Search.Driver_factory.driverfactory;

public class hooks extends driverfactory {
    @Before
    public void SetUp()   {
        openBrowser();
    }

    @After
    public void TearDown(){
        closeBrowser();
    }

}
