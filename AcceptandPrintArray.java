package basic_PF;

import java.util.Scanner;

public class AcceptandPrintArray {

	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
			int i;	
		    int arr[]= new int[5];
			int c=0;
			System.out.println("Enter marks of 5 students");
			for(i=0;(i<5&&(c==0||c==1));i++){
				if(c==0){
					arr[i]=s.nextInt();
				}else{
					System.out.println(arr[i]);
				}
				if(i==4&&c==0){
					c=1;
					i=-1;
				}
			}
			
			}
	}


