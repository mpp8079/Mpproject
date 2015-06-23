package example;

public class SwitchCase {
	
	public static void main(String[]args){
		
		switchStatment(2);
		switchStatment(3);
		switchStatment(0);
		switchStatment(10);
		
	}
	
	public static void switchStatment(int x){
	
		switch(x){
	
	case 0 :
		System.out.println(" X Value is  :" + x);
		break;
	case 1:
		System.out.println(" X Value is : " + x);
		break;
	case 2:
		System.out.println(" X Value is  :" + x);
		break;
	default :
		System.out.println(" X Value is out off Range"+ x);
		break;
	}
	}
}