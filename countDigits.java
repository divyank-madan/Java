package basic_PF;
import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);	
	int num,count=0;
	System.out.println("Enter a number:  \n");
    num = s.nextInt();
    while(num!=0){
    	num=num/10;
    	count++;
    }
    System.out.println("No of digits:"+count);
	}

}
