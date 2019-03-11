package basic_PF;
import java.util.Scanner;
public class SumofMatrices {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of values:");
    int n =s.nextInt();
    int arrA[][]= new int[n][n];
    int arrB[][]=new int[n][n];
    int sumArray[][]=new int[n][n];
    for(int i=0;i<arrA.length;i++){
    	for(int j=0;j<arrA.length;j++){
    		arrA[i][j]=s.nextInt();
    	}
    }
    for(int i=0;i<arrB.length;i++){
    	for(int j=0;j<arrB.length;j++){
    		arrB[i][j]=s.nextInt();
    	}
    }
    for(int i=0;i<sumArray.length;i++){
    	for(int j=0;j<sumArray.length;j++){
    		sumArray[i][j]=arrA[i][j]+arrB[i][j];
    	}
    }
    for(int i=0;i<arrB.length;i++){
    	for(int j=0;j<arrB.length;j++){
    		System.out.print(sumArray[i][j]+"\t");
    	}
    	System.out.println();
    }
    
		
	}

}
