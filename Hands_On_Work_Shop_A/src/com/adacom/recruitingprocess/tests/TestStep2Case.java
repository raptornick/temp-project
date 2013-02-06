package com.adacom.recruitingprocess.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.adacom.recruitingprocess.step2.Main;

public class TestStep2Case {

	@Test
	public void testStep2WithNoArguments() {
		
		System.out.println("Test with NO ARGUMENTS.");
		String[] args = new String[0];
		Main.main(args);
		assert(true);
	}
	
	/* And many other test case */
	@Test
	public void testOther() {
		assert(true);
	}

}
