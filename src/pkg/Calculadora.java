package pkg;

public class Calculadora {
	
	public static Integer suma(int a, int b) {
		return a+b;
	}
	
	public static Integer resta(int a, int b) {
		return a-b;
	}
	
	public static Integer multiplica(int a, int b) {
		return a*b;
	}
	
	public static Integer divide(int a, int b) {
		if(b!=0)
			return a/b;
		else
			return -1;
	}
	
}
