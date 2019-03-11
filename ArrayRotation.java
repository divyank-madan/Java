package basic_PF;
import java.util.Scanner;
public class ArrayRotation {
   
	public void arrayonce(int arr[]){
		int temp=arr[arr.length-1];

        for(int i=arr.length-1;i>=0;i--){
              if(i>0){
                   arr[i]=arr[i-1]; 
              }else{
            	  arr[0]=temp;	   
              }
        }
  
		
        
        for(int j=0;j<arr.length;j++){
        	System.out.println(arr[j]);
        }
	}
			
	
	public void arrayNrotations(int arr[] ,int n){
		
        for(int j=0;j<n;j++){
        int temp=arr[arr.length-1];	
        for(int i=arr.length-1;i>=0;i--){
              if(i>0){
                   arr[i]=arr[i-1]; 
              }else{
            	  arr[0]=temp;	   
              }
        }
  
        }
        
        for(int j=0;j<arr.length;j++){
        	System.out.println(arr[j]);
        }
        
	}
			
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		
		
		int arr[]={1,2,3,4,5};
		
		ArrayRotation ob = new ArrayRotation();
	
		//ob.arrayonce(arr);
		ob.arrayNrotations(arr, 3);
		
		}

}
