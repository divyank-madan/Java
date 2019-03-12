package basic_PF;
import java.util.Scanner;

public class AddorSubtract {
	
	
	public void add(int num1,int num2){
		int add =num1+num2;
		System.out.println("Sum:"+ add);
	}
	
	public void subtract(int num1,int num2){
		int sub;
		if(num1>num2){
		 sub =num1-num2;
		}else{
		 sub=num2-num1;
		}
		System.out.println("Difference:"+ sub);
	 
	}
	
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number:" );
		int num1=s.nextInt();
		System.out.println("Enter second number: ");
		int num2=s.nextInt();

		AddorSubtract ob = new AddorSubtract();
		ob.add(num1, num2);
		ob.subtract(num1, num2);
	}

}
