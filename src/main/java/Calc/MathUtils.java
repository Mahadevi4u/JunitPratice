package Calc;

public class MathUtils {
	 int a[] = new int[]{1,2,3,4};

	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int rem(int a,int b) {
		return a%b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	
	public int returnArrayValue(int index) {
		return a[index];
	}
	
}
