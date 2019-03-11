package basic_PF;
import java.util.Scanner;

public class Patterns {
	
public static void pattern1(int n){
		//bottom left
		
	for(int i=0;i<n;i++){
			for (int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void pattern2(int n){
		//top left
		
		for(int i=0;i<n;i++){
			for (int j=n-i;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void pattern3(int n){
		//bottom right
		
	for(int i=0;i<n;i++){
			for (int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			for (int j=0;j<i+1;j++){
				System.out.print("*");
			}
			
			System.out.println();
		} 
		
	}
	
	public static void pattern4(int n){
		//top right
		
	for(int i=0;i<n;i++){
		
		   for (int j=0;j<i;j++){
			System.out.print(" ");
		    }
		    
			for (int j=0;j<n-i;j++){
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
		
	}
	

	public static void pattern5(int n){
		//pyramid
		
	for(int i=0;i<n;i++){
		
		  for (int j=0;j<n-i;j++){
			System.out.print(" ");
	    	
		    }
		
			for (int j=0;j<(i*2)+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void pattern6(int n){
		// inverted pyramid
		
	for(int i=n;i>0;i--){
		
		for (int j=0;j<n-i;j++){
			System.out.print(" ");
	    	
         }
		
			for (int k=0;k<(i*2)-1;k++){
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter n");
//		int n=s.nextInt();
		
//		pattern1(5);
//		System.out.println();
//		pattern2(5);
//		pattern3(5);
//		pattern4(5);
        pattern5(5);
     	pattern6(5);
	}

}
