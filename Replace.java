package basic_PF;
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	//System.out.println("Java is a language");
	String str = new String("Java is a language");
	System.out.println(str);
	System.out.println("Enter the character to be replaced:");
	char ch1 = s.next().charAt(0);
	System.out.println("Enter the character to be replaced with:");
	char ch2 = s.next().charAt(0);
	char arr[] = new char[str.length()];
	for(int i=0;i<str.length();i++){
		arr[i]=str.charAt(i);
		
	}
	for(int i=0;i<str.length();i++){
		if(arr[i]==ch1){
			arr[i] = ch2;
			}
		
	}
	for(int i=0;i<str.length();i++)
		System.out.print(arr[i]);
	
    	

	}

}
