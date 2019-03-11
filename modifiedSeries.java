package basic_PF;
import java.util.Scanner;

public class modifiedSeries {

	
	
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int next=0;
	System.out.println("Enter two numbers");	
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	System.out.println("Enter the n");
	int n= s.nextInt();
	System.out.println(num1 + "\n"+ num2);
    for(int i=2;i<n;i++){
    
    	    	
 	if(i%2==0){
    		next=num1+num2;
    		
    	}else{
    		next=num1-num2;
    		
    	}
    num1=num2;
    num2=next;
    System.out.println(next+" " );
    }
    
	}

}
