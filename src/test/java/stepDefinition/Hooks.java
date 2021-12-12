package stepDefinition;

import base.Main;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Main{
	
	// Pre-requisite and Post requisite code -> so that the method from main class (initialization & tearDown) doesn't need to be called
	
	@Before
	public void loadBrowser() {
		initialization();
	}
	
	@After
	public void closeBrowser() {
		tearDown();
	}

}
