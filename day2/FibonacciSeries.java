package week2.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int d=11;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=d;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	

}
