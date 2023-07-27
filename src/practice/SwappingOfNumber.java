package practice;

public class SwappingOfNumber {
	
	public static void main(String[] args) {
		
		//one way
		int a=25;
		int b=67;
		System.out.println(a+" "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After reversing"+a+" "+b);
		
		//two way
		int d=56;
		int e=78;
		System.out.println(d+" "+e);
		d+=e;
		e=d-e;
		d=d-e;
		System.out.println("After reversing"+d+" "+e);
		
		//third way
		
	}

}
