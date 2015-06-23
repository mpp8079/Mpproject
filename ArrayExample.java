package example;

public class ArrayExample{
	
	
	public static void main(String[]args){
				
		arrayExample();
	}
	
	public static void arrayExample(){
		
		int [] a = {10,20,30,40,50};
		System.out.println( a[3]+" \t"+ a[4]);
		
		for(int mpp : a){
			System.out.println(mpp);
		}
		
		System.out.println("___________________________________");
		
	
	
	int [] b = new int [6];
	
	 b [2]= 15;
	 b [3]= 20;
	
	for(int mp :b){
		System.out.println(mp);
	}
	
	System.out.println("________________________________________");
	
	String[] c= new String[6];
	c[2]="APRIL";
	c[3]="JUNE";
	
	for(String mkp : c){
		System.out.println(mkp);
	}
	
	
	
	}
}
