package basic_PF;
import java.util.Scanner;

public class IsPrimetillN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int flag=0;
		
		
		System.out.println("Enter N");
	       int N =s.nextInt();

	       

	       if(N>3)

	              System.out.println("2\t3\t");

	       for(int i=4;i<=N;i++)

	       {

	              for(int j=2;j<=(i/2);j++)

	              {

	                     if(i%j==0)

	                     {

	                           flag=1;

	                           break;

	                     }

	              }

	              if(flag==0)

	                     System.out.print(i+"\t");

	             

	              flag=0;

	       }

	}
		
			
	}




