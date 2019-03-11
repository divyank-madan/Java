package basic_PF;
import java.util.Scanner;
public class Add5Digits {

	public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
		int i,sum=0,num; 
		System.out.println("Add 5 digits");
        for(i=0;i<5;i++){
        	num=s.nextInt();
        	sum=sum+num;
        }
        System.out.println("Sum:"+sum);

	}

}
