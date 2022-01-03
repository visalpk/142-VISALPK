package junitmockitowhenthenreturn;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class CalcTest {
	
	static Calculator mockCalcObject;
	static int a,b;
	@BeforeClass
	public static void init() {

		// set EmployeeDAO mock object
		mockCalcObject = mock(Calculator.class);
		
		when(mockCalcObject.add(a,b)).thenReturn(6);
		when(mockCalcObject.sub(5,5)).thenReturn(5);
	}
	
	
	 
	
	  @Test public void addTest() {
	  
	  assertEquals(mockCalcObject.add(a,b),5); //assertEquals(mockCalcObject.add(a, b),5);
	  
	  }
	  @Test public void subTest() {
		  
		  assertEquals(mockCalcObject.sub(5,5),5); 
		  
		  }
	 
	
	}
	
	 
 
