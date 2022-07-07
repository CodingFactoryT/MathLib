package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import util.StandardOperations;

public final class StandardOperations_Test {
	
	@Test
	public void testAdd() {
		assertEquals(10, StandardOperations.add(1,2,3,4));
		assertEquals(100000000000l, StandardOperations.add(10000000000l,20000000000l,30000000000l,40000000000l));
	}
	
	@Test
	public void testSubstract() {
		assertEquals(5, StandardOperations.subtract(8,3));
		assertEquals(2000l, StandardOperations.subtract(3000l,1000l));
	}
	
	@Test
	public void testAverage() {
		assertEquals(1.5, StandardOperations.average(1,2));
		assertEquals(3.5, StandardOperations.average(1,2,3,4,5,6));
	}
}
