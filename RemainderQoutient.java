package basic_PF;
import java.util.Scanner;
public class RemainderQoutient {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);	
	int remainder=0,qoutient=0;
	int count=0;
	System.out.println("Enter dividend:");
	int num1=s.nextInt();
	System.out.println("Enter divisor:");
	int num2=s.nextInt();
	while(num1>=num2){
		num1=num1-num2;
		count++;
		if(num1<num2){
			remainder=num1;
			break;
		}
	}
   System.out.println("Qoutient:"+count);
   System.out.println("Remainder:"+remainder);
	}

}
