package basic_PF;
import java.util.Scanner;

public class Substring {
	String str="Hello World";
	char arr[];
	Substring(){
		arr=str.toCharArray();
	}
	
	public void subscript1(int in,int out){
		if(in<out){
		 for(int j=in;j<=out;j++){
		    	System.out.println(arr[j]);
		    }
		}else {
		System.out.println("Invalid");
		}
	}
	
	public void subscript2(int in,int out){
		
		if(in+out<str.length()){
		for(int j=in ;j<=in+out;j++){
			System.out.print(arr[j]);
		}
		}else{
			System.out.println("Value exceeding string size , enter valid values again to find a substring.");
		}
		
	}
	

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str="Hello World";
    System.out.println(str);
    char arr[]=new char[str.length()];
    for(int i=0;i<str.length();i++){
    	arr[i]=str.charAt(i);
    }
    System.out.println("Enter the initial index:");
    int in = s.nextInt();
    System.out.println("Enter the final index");
    int out = s.nextInt();
    Substring ob=new Substring();
   //  ob.subscript1(in, out); 
     ob.subscript2(in,out);
   
    
    
	}

}
