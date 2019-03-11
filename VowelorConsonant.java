package basic_PF;

public class VowelorConsonant {

	public static void main(String[] args) {
		
	String str= new String("CBIDE");
    String str1=str.toLowerCase();
	if(str1.charAt(3)=='a' ||str1.charAt(3)=='e'||str1.charAt(3)=='i'||str1.charAt(3)=='o'||str1.charAt(3)=='u'){
		System.out.println("It is a vowel.");
	}else{
		System.out.println("It is a consonant.");
	}
	} 

}
