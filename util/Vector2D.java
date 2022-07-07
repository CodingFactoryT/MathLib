package util;

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
	
	public Vector2D add(Vector2D v) {
		double x = this.x + v.x;
		double y = this.y + v.y;
		return new Vector2D(x, y);
	}
	
	public Vector2D subtract(Vector2D v) {
		double x = this.x - v.x;
		double y = this.y - v.y;
		return new Vector2D(x, y);
	}
	
	public Vector2D divide(Vector2D v) {
		double x = this.x / v.x;
		double y = this.y / v.y;
		return new Vector2D(x, y);
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

	public Vector2D scalarProduct(Vector2D v) {
		return new Vector2D(this.x*v.x, this.y*v.y);
	}
	
	public Vector2D dotProduct(Vector2D v) {
		return scalarProduct(v);
	}
	
	public Vector2D multiply(Vector2D v) {
		return scalarProduct(v);
	}
	
	public Vector2D multiply(int multiplier) {
		return new Vector2D(this.x*multiplier, this.y*multiplier);
	}
	
	public Vector2D connectionVector2D(Vector2D v) {
		return v.subtract(this);
	}
	
	public double determinant(Vector2D v) {
		return this.x*v.y - this.y*v.x;
	}
	
	public double crossProduct(Vector2D v) {
		return determinant(v);
	}
	
	public boolean isLinearlyDependent(Vector2D v) {
		return determinant(v) == 0;
	}
	
	public boolean isParallel(Vector2D v) {
		return isLinearlyDependent(v);
	}
	
}
