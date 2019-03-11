package basic_PF;
import java.util.Scanner;

public class Largestof2numbers {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1=s.nextInt();
	System.out.println("Enter second number:");
	int num2=s.nextInt();
	if(num1>=num2){
		System.out.println(num1+" is largest.");
	}else{
		System.out.println(num2+" is largest.");
	}
    
	}

}
