package basic_PF;
import java.util.Scanner;

public class NumSum {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start = s.nextInt();
		System.out.println("Enter the ending number");
		int end =s.nextInt();
		int sum=0;
		int n;
		if(start<end){
			n=end-start+1;
		}else{
			n=start-end+1;
		}
	    int arr[]=new int[n];
	    int j=0;
	    if(start<end){
			for(int i=start;i<=end;i++){
				
				arr[j]=i;
				j++;
			}
	    }else{	for(int i=start;i>=end;i--){
			
			arr[j]=i;
			j++;
		}
			
			}
	    
	   for(int i=0;i<n;i++){
		sum=sum+arr[i];
	   }
		System.out.println("Sum:"+sum);
				
			}
	
		}

	


