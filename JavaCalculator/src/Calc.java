
public class Calc {

	int result;
	
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	
	public static int subtract(int a, int b) {
		int result = a - b;
		return result;
	}

	
	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public static int divide(int a, int b) {
		int result = a / b;
		return result; 
	}


	@Override
	public String toString() {
		return "Calc [result=" + result + "]";
	}

	
	
}
