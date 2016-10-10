import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AreaTesting(){

		Triangle a = new Triangle(5, 12, 13);
		assertTrue(a.getArea() == 30.0);

	}

	@Test
	public void PerimeterTest() {
		Triangle a = new Triangle(5, 12, 13);
		assertTrue(a.getPerimeter() == 30.0);
	}

	@Test
	public void isATriangle(){
		Triangle t = new Triangle(2,2,100);
		t.getArea();
		
	}

}
