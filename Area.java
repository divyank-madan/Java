package basic_PF;
import java.util.Scanner;

public class Area {
    
	public void square(int side){
		int area= side*side;
		System.out.println("Area of square:"+ area);
	}
	
	public void rectangle(int l, int b){
		int area= l*b;
		System.out.println("Area of rectangle:"+ area);
	}
	
	
	
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter side length for square:");
    int side = s.nextInt();
    Area ob = new Area();
    ob.square(side);
    System.out.println("Enter length for rectangle:");
    int length = s.nextInt();
    System.out.println("Enter breadth for rectangle:");
    int breadth = s.nextInt();
    ob.rectangle(length, breadth);
	
	}

}
