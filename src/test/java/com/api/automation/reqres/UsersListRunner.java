package com.api.automation.reqres;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class UsersListRunner {
	
	@Test
	public Karate runTest() {
		return Karate.run("usersList").tags("ANKO").relativeTo(getClass());
	}

}
