package springmvcexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class sample {
	int s=10;
	int p=20;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Beforeclass to intitae variable/others before all test case");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Afterclass to initiate finally after all test case ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("initialze value before every test case");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Alter/Reset value after every test case");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		
		assertTrue(s<p);
	}

}
