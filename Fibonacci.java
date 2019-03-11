package basic_PF;

public class Fibonacci {
	
	public static void fib(){
		int num1=1,num2=2;
		int i=1;
		
		while(i<8){
			System.out.println(num1+"");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			i++;
			
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib();
		
		

	}

}
