package Testing;

import util.Vector2D;
import util.Vector3D;

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
		assertEquals(3, Vector2D.add(v1, v2).x);
		assertEquals(5, Vector2D.add(v1, v2).y);
		
		assertEquals(4, Vector2D.add(v1, v3).x);
		assertEquals(6, Vector2D.add(v1, v3).y);
	}
	
	@Test
	public void testSubtract() {
		assertEquals(-1, Vector2D.subtract(v1, v2).x);
		assertEquals(-1, Vector2D.subtract(v1, v2).y);
		
		assertEquals(-2, Vector2D.subtract(v1, v3).x);
		assertEquals(-2, Vector2D.subtract(v1, v3).y);
	}
	
	@Test
	public void testDivide() {
		assertEquals(5, Vector2D.divide(v5, v6).x);
		assertEquals(2, Vector2D.divide(v5, v6).y);
		
		assertEquals(10, Vector2D.divide(v5, v1).x);
		assertEquals(2, Vector2D.divide(v5, v1).y);
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
		assertEquals(2, Vector2D.scalarProduct(v1, v2).x);
		assertEquals(6, Vector2D.scalarProduct(v1, v2).y);

		assertEquals(30, Vector2D.scalarProduct(v3, v5).x);
		assertEquals(16, Vector2D.scalarProduct(v3, v5).y);
	}
	
	@Test
	public void testDotProduct() {
		assertEquals(2, Vector2D.dotProduct(v1, v2).x);
		assertEquals(6, Vector2D.dotProduct(v1, v2).y);

		assertEquals(30, Vector2D.dotProduct(v3, v5).x);
		assertEquals(16, Vector2D.dotProduct(v3, v5).y);
	}
	
	@Test
	public void testMultiply() {
		assertEquals(4, v1.multiply(4).x);
		assertEquals(8, v1.multiply(4).y);
		
		assertEquals(20, v5.multiply(2).x);
		assertEquals(8, v5.multiply(2).y);
		
		assertEquals(2, Vector2D.multiply(v1, v2).x);
		assertEquals(6, Vector2D.multiply(v1, v2).y);

		assertEquals(30, Vector2D.multiply(v3, v5).x);
		assertEquals(16, Vector2D.multiply(v3, v5).y);
	}
	
	@Test
	public void testConnectionVector2D() {
		assertEquals(3, Vector2D.connectionVector2D(v1, v8).x);
		assertEquals(-1, Vector2D.connectionVector2D(v1, v8).y);
		
		assertEquals(1, Vector2D.connectionVector2D(v1, v2).x);
		assertEquals(1, Vector2D.connectionVector2D(v1, v2).y);
	}
	
	@Test
	public void testDeterminant() {
		assertEquals(-1, Vector2D.determinant(v1, v2));
		assertEquals(-27, Vector2D.determinant(v7, v8));
	}
	
	@Test
	public void testCrossProduct() {
		assertEquals(-1, Vector2D.crossProduct(v1, v2));
		assertEquals(-27, Vector2D.crossProduct(v7, v8));
	}
	
	@Test
	public void testIsLinearlyDependent() {
		assertEquals(true, Vector2D.isLinearlyDependent(v9, v10));
		assertEquals(false, Vector2D.isLinearlyDependent(v3, v4));
	}
	
	@Test
	public void testIsParallel() {
		assertEquals(true, Vector2D.isParallel(v9, v10));
		assertEquals(false, Vector2D.isParallel(v3, v4));
	}
}
