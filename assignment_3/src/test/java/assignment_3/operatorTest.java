package assignment_3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class operatorTest {
	
	operator obj;
	int a;

	@Before
	public void setUp() throws Exception {
		obj = new operator();
		a=5;
		
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		a = 0;
	}

	@Test
	public void test() {
		assertEquals(125, obj.cube(a));
	}

}
