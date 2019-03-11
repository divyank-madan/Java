package basic_PF;
import java.util.Scanner;

public class upperToLower {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		char ch;
		int temp;
		System.out.println("Enter a character");
		ch=s.next().charAt(0);
		temp=ch;

		if(temp>=97 && temp<=123){
			temp=temp-32;
			System.out.println((char)temp);
		}else if(temp>=65 && temp<=91){
			temp=temp+32;
			System.out.println((char)temp);
			
			
		}else{
			System.out.println("Not an alphabetical value.");
		}
		
        
    
	
	}

}
