package basic_PF;
import java.util.Scanner;

public class RecursiveFib {

	
	public static int fib(int n){
	int num1=0;
	int num2=1;
		if(n==0){
			return num1;
		}
		if(n==1){
			return num2;
		}
		
	return fib(n-1)+fib(n-2);

	}
	
	
	
	
	
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the fibonacci term:");
    int n=s.nextInt();
  
    for(int i=0;i<n;i++){
    System.out.print(" "+fib(i));
    }
	}

}
