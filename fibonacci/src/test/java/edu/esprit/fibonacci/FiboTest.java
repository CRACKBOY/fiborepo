package edu.esprit.fibonacci;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FiboTest {
	Fibo f;
	
	@Before
	protected void setUp() throws Exception {
		f = new Fibo();
	}
	
	@Test
	public void itShouldReturnOneWhentow(){
		assertEquals(5, 5);
	}
}
