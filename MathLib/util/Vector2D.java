package MathLib.util;

public class Vector2D {
	public double x;
	public double y;
	
	public static final Vector2D UP = new Vector2D(0, 1);
	public static final Vector2D DOWN = new Vector2D(0, -1);
	public static final Vector2D RIGHT = new Vector2D(1, 0);
	public static final Vector2D LEFT = new Vector2D(-1, 0);
	public static final Vector2D ONE = new Vector2D(1, 1);
	public static final Vector2D ZERO = new Vector2D(0, 0);

	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector2D(Vector2D v) {
		this.x = v.x;
		this.y = v.y;
	}
	
	public static Vector2D add(Vector2D v1, Vector2D v2) {
		double x = v1.x + v2.x;
		double y = v1.y + v2.y;
		return new Vector2D(x, y);
	}
	
	public static Vector2D subtract(Vector2D v1, Vector2D v2) {
		double x = v1.x - v2.x;
		double y = v1.y - v2.y;
		return new Vector2D(x, y);
	}
	
	public static Vector2D divide(Vector2D v1, Vector2D v2) {
		double x = v1.x / v2.x;
		double y = v1.y / v2.y;
		return new Vector2D(x, y);
	}
	
	public Vector2D divide(double divider) {
		return new Vector2D(this.x/divider, this.y/divider);
	}
	
	public static Vector2D multiply(Vector2D v1, Vector2D v2) {
		return new Vector2D(v1.x*v2.x, v1.y*v2.y);
	}
	
	public Vector2D multiply(double multiplier) {
		return new Vector2D(this.x*multiplier, this.y*multiplier);
	}
	
	public double magnitude() {
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	
	public double length() {
		return magnitude();
	}
	
	public Vector2D negativeVector2D() {
		return this.multiply(-1);
	}

	public static Vector2D scalarProduct(Vector2D v1, Vector2D v2) {
		return multiply(v1, v2);
	}
	
	public static Vector2D dotProduct(Vector2D v1, Vector2D v2) {
		return multiply(v1, v2);
	}
	
	public static Vector2D connectionVector2D(Vector2D v1, Vector2D v2) {
		return subtract(v2, v1);
	}
	
	public static double determinant(Vector2D v1, Vector2D v2) {
		return v1.x*v2.y - v1.y*v2.x;
	}
	
	public static double crossProduct(Vector2D v1, Vector2D v2) {
		return determinant(v1, v2);
	}
	
	public static boolean isLinearlyDependent(Vector2D v1, Vector2D v2) {
		return determinant(v1, v2) == 0;
	}
	
	public static boolean isParallel(Vector2D v1, Vector2D v2) {
		return isLinearlyDependent(v1, v2);
	}
	
}
