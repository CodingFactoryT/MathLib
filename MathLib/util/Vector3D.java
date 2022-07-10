package MathLib.util;

public class Vector3D {
	public double x;
	public double y;
	public double z;
	
	public static final Vector3D UP = new Vector3D(0, 1, 0);
	public static final Vector3D DOWN = new Vector3D(0, -1, 0);
	public static final Vector3D RIGHT = new Vector3D(1, 0, 0);
	public static final Vector3D LEFT = new Vector3D(-1, 0, 0);
	public static final Vector3D ONE = new Vector3D(1, 1, 1);
	public static final Vector3D ZERO = new Vector3D(0, 0, 0);
	public static final Vector3D FORWARD = new Vector3D(0, 0, 1);
	public static final Vector3D BACK = new Vector3D(0, 0, -1);


	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3D(Vector3D v) {
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	public static Vector3D add(Vector3D v1, Vector3D v2) {
		double x = v1.x + v2.x;
		double y = v1.y + v2.y;
		double z = v1.z + v2.z;
		return new Vector3D(x, y, z);
	}
	
	public static Vector3D subtract(Vector3D v1, Vector3D v2) {
		double x = v1.x - v2.x;
		double y = v1.y - v2.y;
		double z = v1.z - v2.z;
		return new Vector3D(x, y, z);
	}
	
	public static Vector3D divide(Vector3D v1, Vector3D v2) {
		double x = v1.x / v2.x;
		double y = v1.y / v2.y;
		double z = v1.z / v2.z;
		return new Vector3D(x, y, z);
	}
	
	public double magnitude() {
		return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
	}
	
	public double length() {
		return magnitude();
	}
	
	public Vector3D negativeVector3D() {
		return this.multiply(-1);
	}

	public static Vector3D scalarProduct(Vector3D v1, Vector3D v2) {
		return multiply(v1, v2);
	}
	
	public static Vector3D dotProduct(Vector3D v1, Vector3D v2) {
		return multiply(v1, v2);
	}
	
	public static Vector3D multiply(Vector3D v1, Vector3D v2) {
		return new Vector3D(v1.x*v2.x, v1.y*v2.y, v1.z*v2.z);
	}
	
	public Vector3D multiply(double multiplier) {
		return new Vector3D(this.x*multiplier, this.y*multiplier, this.z*multiplier);
	}
	
	public static Vector3D connectionVector3D(Vector3D v1, Vector3D v2) {
		return subtract(v2, v1);
	}
	
	public static double determinant(Vector3D v1, Vector3D v2, Vector3D v3) {
		double a = v1.x*v2.y*v3.z;
		double b = v1.y*v2.z*v3.x;
		double c = v1.z*v2.x*v3.y;
		double d = v3.x*v2.y*v1.z;		//rule of Sarrus
		double e = v3.y*v2.z*v1.x;
		double f = v3.z*v2.x*v1.y;
		
		return a+b+c-d-e-f;
	}
	
	public static Vector3D crossProduct(Vector3D v1, Vector3D v2) {
		double x = v1.y*v2.z - v1.z*v2.y;
		double y = v1.z*v2.x - v1.x*v2.z;
		double z = v1.x*v2.y - v1.y*v2.x;
		return new Vector3D(x, y, z);
	}
	
	public static boolean isLinearlyDependent(Vector3D v1, Vector3D v2) {
		double a = v1.x / v2.x;
		double b = v1.y / v2.y;
		double c = v1.z / v2.z;
		
		return a == b && b == c;
	}
	
	public static boolean isParallel(Vector3D v1, Vector3D v2) {
		return isLinearlyDependent(v1, v2);
	}
	
}
