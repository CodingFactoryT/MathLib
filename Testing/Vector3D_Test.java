package Testing;

import util.Vector3D;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;  

public class Vector3D_Test {
	
	Vector3D v1 = new Vector3D(2, 4, 10);
	Vector3D v2 = new Vector3D(1,2, 5);
	Vector3D v3 = new Vector3D(Vector3D.ONE);
	
	@Test
	public void testIsLinearlyDependent() {
		assertEquals(true, Vector3D.isLinearlyDependent(v1, v2));
		assertEquals(false, Vector3D.isLinearlyDependent(v2, v3));
	}
	
	@Test
	public void testIsParallel() {
		assertEquals(true, Vector3D.isParallel(v1, v2));
		assertEquals(false, Vector3D.isParallel(v2, v3));
	}
}
