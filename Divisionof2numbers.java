package basic_PF;
import java.util.Scanner;

public class Divisionof2numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter first number:");
		int num1 =  s.nextInt();
		System.out.println("Enter second number:");
		int num2 = s.nextInt();
		float quotient = (num1/num2);
		System.out.println("Qoutient:"+ quotient);
		
	}

}
