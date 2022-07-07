package util;

public class StandardOperations {
	
	public static int add(int... values) {
		int result = 0;
		for(int i : values) {
			result += i;
		}	
		return result;
	}
	
	public static long add(long... values) {
		long result = 0;
		for(long i : values) {
			result += i;
		}	
		return result;
	}
	
	public static int subtract(int... values) {
		int result = values[0];
		for(int i = 1; i < values.length; i++) {
			result -= values[i];
		}
		return result;
	}
	
	public static long subtract(long... values) {
		long result = values[0];
		for(int i = 1; i < values.length; i++) {
			result -= values[i];
		}	
		return result;
	}
	
	public static double average(int... values) {
		int combined = 0;
		for(int i : values) {
			combined += i;
		}
		return combined / (double) values.length;
	}
}
