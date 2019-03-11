package basic_PF;
import java.util.Scanner;
public class Averageof10 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	    System.out.println("Enter number of values:");
		int n = s.nextInt();
		int arr[]= new int[n];	
		int sum=0;
		float average;
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		average = sum/n;
		System.out.println("Average:" + average);
	}

}
