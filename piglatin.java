package basic_PF;
import java.util.Scanner;
public class piglatin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        char arr1[]={'A','R','K'};
        
        for(int i=0;i<3;i++){
        int index = 'Z'-arr1[i];
        char ch= (char)('A'+index);
        System.out.println(ch);
        }
       
       
        
        
        
  
}
}
