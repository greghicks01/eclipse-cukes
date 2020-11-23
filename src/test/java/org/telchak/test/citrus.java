package org.telchak.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.consol.citrus.annotations.CitrusResource;
import com.consol.citrus.endpoint.Endpoint;

import io.cucumber.java.en.Given;
import junit.textui.TestRunner;

public class citrus {
	
	
			 
	 @CitrusResource
	 protected TestRunner runner;
	 
	 @Given("I want to write a step with preconditions")
		public void i_want_to_write_a_step_with_preconditions() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		   
		}

}
