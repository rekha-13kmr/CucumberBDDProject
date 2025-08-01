package stepdefinitionfiles;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
    public void setup() {
    	initDriver();
    }

    @After
    public void teardown() {
    	
 
		closeDriver();
    }
}
