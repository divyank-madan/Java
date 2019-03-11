package basic_PF;

public class pyramidPattern {

	public static void main(String[] args) {
    String str="School";
    for(int i=0;i<str.length();i++){
    	for(int j=0;j<i+1;j++){
    		
    		System.out.print(str.charAt(j));
    	}
    	System.out.println();
    }
    

	}

}
