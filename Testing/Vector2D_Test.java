package Testing;

import util.Vector2D;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;  

public final class Vector2D_Test {

	Vector2D v1 = new Vector2D(1,2);
	Vector2D v2 = new Vector2D(2,3);
	Vector2D v3 = new Vector2D(3,4);
	Vector2D v4 = new Vector2D(6,0);
	Vector2D v5 = new Vector2D(10,4);
	Vector2D v6 = new Vector2D(2,2);
	Vector2D v7 = new Vector2D(-7,5);
	Vector2D v8 = new Vector2D(4,1);
	Vector2D v9 = new Vector2D(2,1);
	Vector2D v10 = new Vector2D(4,2);

	@Test
	public void testAdd() {
		assertEquals(3, v1.add(v2).x);
		assertEquals(5, v1.add(v2).y);
		
		assertEquals(4, v1.add(v3).x);
		assertEquals(6, v1.add(v3).y);
	}
	
	@Test
	public void testSubtract() {
		assertEquals(-1, v1.subtract(v2).x);
		assertEquals(-1, v1.subtract(v2).y);
		
		assertEquals(-2, v1.subtract(v3).x);
		assertEquals(-2, v1.subtract(v3).y);
	}
	
	@Test
	public void testDivide() {
		assertEquals(5, v5.divide(v6).x);
		assertEquals(2, v5.divide(v6).y);
		
		assertEquals(10, v5.divide(v1).x);
		assertEquals(2, v5.divide(v1).y);
	}
	
	@Test
	public void testMagnitude() {
		assertEquals(5, v3.magnitude());
		assertEquals(6, v4.magnitude());
	}
	
	@Test
	public void testLength() {
		assertEquals(5, v3.length());
		assertEquals(6, v4.length());
	}
	
	@Test
	public void testNegativeVector2D() {
		assertEquals(-1, v1.negativeVector2D().x);
		assertEquals(-2, v1.negativeVector2D().y);

		assertEquals(7, v7.negativeVector2D().x);
		assertEquals(-5, v7.negativeVector2D().y);
	}

	@Test
	public void testScalarProduct() {
		assertEquals(2, v1.scalarProduct(v2).x);
		assertEquals(6, v1.scalarProduct(v2).y);

		assertEquals(30, v3.scalarProduct(v5).x);
		assertEquals(16, v3.scalarProduct(v5).y);
	}
	
	@Test
	public void testDotProduct() {
		assertEquals(2, v1.dotProduct(v2).x);
		assertEquals(6, v1.dotProduct(v2).y);

		assertEquals(30, v3.dotProduct(v5).x);
		assertEquals(16, v3.dotProduct(v5).y);
	}
	
	@Test
	public void testMultiply() {
		assertEquals(4, v1.multiply(4).x);
		assertEquals(8, v1.multiply(4).y);
		
		assertEquals(20, v5.multiply(2).x);
		assertEquals(8, v5.multiply(2).y);
		
		assertEquals(2, v1.multiply(v2).x);
		assertEquals(6, v1.multiply(v2).y);

		assertEquals(30, v3.multiply(v5).x);
		assertEquals(16, v3.multiply(v5).y);
	}
	
	@Test
	public void testConnectionVector2D() {
		assertEquals(3, v1.connectionVector2D(v8).x);
		assertEquals(-1, v1.connectionVector2D(v8).y);
		
		assertEquals(1, v1.connectionVector2D(v2).x);
		assertEquals(1, v1.connectionVector2D(v2).y);
	}
	
	@Test
	public void testDeterminant() {
		assertEquals(-1, v1.determinant(v2));
		assertEquals(-27, v7.determinant(v8));
	}
	
	@Test
	public void testCrossProduct() {
		assertEquals(-1, v1.crossProduct(v2));
		assertEquals(-27, v7.crossProduct(v8));
	}
	
	@Test
	public void testIsLinearlyDependent() {
		assertEquals(true, v9.isLinearlyDependent(v10));
		assertEquals(false, v3.isLinearlyDependent(v4));
	}
	
	@Test
	public void testIsParallel() {
		assertEquals(true, v9.isParallel(v10));
		assertEquals(false, v3.isParallel(v4));
	}
}
