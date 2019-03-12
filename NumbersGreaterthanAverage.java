package basic_PF;
import java.util.Scanner;

public class NumbersGreaterthanAverage {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int arr[]=new int[10];
	int sum=0;
	float average;
	System.out.println("Enter values in array:");
	for(int i=0;i<10;i++){
		arr[i]=s.nextInt();
	}
	
	for(int i=0;i<10;i++){
		sum = sum + arr[i];
	}
	average=sum/10;
	System.out.println("Average:"+ average);
	for(int i=0;i<10;i++){
		if(arr[i]>average){
			System.out.println(arr[i]);
		}
	}
	
	}

}
