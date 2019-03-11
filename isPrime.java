package basic_PF;
import java.util.Scanner;
public class isPrime {

	public static void main(String[] args) {
	int num;
	int flag=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number:");
	num=s.nextInt();

	if(num<1){
		System.out.println("Invalid Value");
	}
	
	if(num==1){
		System.out.println("1 is co-prime number.");
	}
	
	if(num>2){
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				flag=1;
				break;
		}
	  }
	}	
	
	if(flag==1){
    System.out.println("It is not prime.");
	}else{
	System.out.println("It is prime.");
		
	

	}

	}
	
}
