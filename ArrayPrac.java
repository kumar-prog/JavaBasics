
public class ArrayPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		arr[0]=5;
		arr[1]=6;
		arr[2]=8;
		arr[3]=7;
		arr[4]=9;
		
		int target=7;
		
		for(int i=0; i< arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Elment found at" + i + "Index");
				return;
			}
			
		}
		System.out.println("Element Not Found");
		
		
		
		
		

	}

}
