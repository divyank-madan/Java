package basic_PF;
import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    System.out.println("Enter distance in kms:");
    int distance = s.nextInt();
    System.out.println("Enter speed in km/hrs:");
    int speed = s.nextInt();
    float time= (distance/speed);
    System.out.println("Time taken:"+ time+" hrs.");
	}

}
