package basic_PF;
import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int a[]=new int[5];
	System.out.println("Enter 5 numbers:");
	for(int i=0;i<5;i++){
		a[i]=s.nextInt();
	}
    int sum=0;
	for(int i=0;i<5;i++){
		sum=sum+a[i];
		
	}
    float average = sum/5;
    System.out.println("Sum:"+ sum);
    System.out.println("Average:"+ average);
	}

}
