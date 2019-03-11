package basic_PF;
import java.util.Scanner;

public class Largestof4Numbers {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no. of values");
	int n =s.nextInt();
	int arr[]= new int[n];
	int largest=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++){
		
		if(arr[i]>largest){
			 largest=arr[i];
		 }
	}
	System.out.println("Largest No:"+ largest);
	}

}
