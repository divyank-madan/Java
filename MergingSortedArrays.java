package basic_PF;
import java.util.Scanner;
public class MergingSortedArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		int resArr[]=new int[6];
		System.out.println("Enter first sorted array");
		for(int i=0;i<3;i++){
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter second sorted array");
		for(int i=0;i<3;i++){
			arr2[i]=s.nextInt();
		}
		
	
		for(int i=0,j=0,k=0;k<6;k++){
			if(i<3 && j<3){
				if(arr1[i]<=arr2[j]){
				resArr[k]= arr1[i];
				i++;
				}else{
				resArr[k]= arr2[j];
				j++;
				}
			}	
			else if(i>=3 && j<3){
	    	   resArr[k]=arr2[j];
	    	   j++;
	    	   }
		    else{
	    	   resArr[k]=arr1[i];
	    	   i++;
	       }
		
		
		}
		
		for(int i=0;i<6;i++){
			System.out.println(resArr[i]);
		}
	}

}
