package basic_PF;
import java.util.Scanner;

public class Kmtometers {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter distance in kilometers:");
		int km = s.nextInt();
		long result=km*1000;
		System.out.println("Distance in meters:"+ result+" meters");
		
		

	}

}
