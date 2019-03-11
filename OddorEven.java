package basic_PF;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num1=s.nextInt();
    if(num1%2==0){
    	System.out.println("It is even.");
    }else{
    	System.out.println("It is odd.");
    }
	}

}
