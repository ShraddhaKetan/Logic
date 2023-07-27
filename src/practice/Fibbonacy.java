package practice;

public class Fibbonacy {
public static void main(String[] args) {
	int f=0, s=1, c=1;
	System.out.println(f);
	for(int i=1;i<=10;i++)
	{
		System.out.println(c);
		c=f+s;
		f=s;
	    s=c;
		
	}
	
//	int num=13;
//	int r=1;
//	int f=0;
//	int s=1;
//	for(int i=1;i<=num;i++)
//	{
//	r=f+s; 
//	f=s;
//	s=r;
//	System.out.println(r);
//	}
	
}
}
