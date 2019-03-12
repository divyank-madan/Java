package basic_PF;

public class AscendingOrderArray {
	

	public static void main(String[] args) {
		
		int arr[]={4,3,8,7,6,1,2,9,4};
		int temp;
		for(int j=0;j<arr.length-1;j++){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}
	}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
        
		
	

}
}