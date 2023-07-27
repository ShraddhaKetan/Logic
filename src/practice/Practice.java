package practice;

public class Practice {
	
	 Practice(int a,char b){
		System.out.println("parametrised constructor called");
	}
	private Practice() {
		System.out.println("Default onstructor called");
	}
	
	
	public static void main(String[] args) {
		Practice p=new Practice();
		int array[]= {1,2,3,4,5};
		int result=0;
		for(int i=0;i<=4;i++) {
			result=result+array[i];
		}
		
		System.out.println("sum of array element is : "+result);
	}
	

}