package basic_PF;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num,  count=0,sum=0;
		int temp, remainder;
		System.out.println("Enter a number");
		num= s.nextInt();
		temp=num;
        while(num!=0){
         num=num/10;
        count++;
        }
       // temp=num;
        for(int i=0;i<count;i++){
        	remainder= temp%10;
        	sum=sum+remainder;
        	temp=temp/10;
        	
        }
        System.out.println("Sum of digits:"+sum);
        
        
        
        
	}

}
