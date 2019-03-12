package basic_PF;
import java.util.Scanner;

public class AcceptandDisplaySmallestof3 {
	Scanner s = new Scanner(System.in);
	
	public void Accept(){
		
		System.out.println("Enter first num:");
		int num1=s.nextInt();
		System.out.println("Enter second num:");
		int num2=s.nextInt();
		System.out.println("Enter third num:");
		int num3=s.nextInt();
		
		FindSmallest(num1, num2, num3);
		
	}
	public void FindSmallest(int num1,int num2,int num3){
		
		if(num1<num2 && num1<num3){
			System.out.println(num1 +" is smallest.");
		}else if(num2<num3){
			System.out.println(num2 +" is smallest.");
		}else{
			System.out.println(num3 +" is smallest.");
		}
	}

	public static void main(String[] args) {
	
	AcceptandDisplaySmallestof3 ob=new AcceptandDisplaySmallestof3();
	ob.Accept();

	}

}
