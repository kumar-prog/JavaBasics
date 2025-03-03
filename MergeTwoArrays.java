import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a1 = {"Chai","Coffee"};
		String a2[] = {"Milk","Water","Coke"};
		String[] a3= new String [a1.length+a2.length];
		
		
		for(int i=0; i<a1.length;i++) 
		{
			a3[i]=a1[i];
			//System.out.println(a3[i]);
		}
		
		for(int i=0;i<a2.length;i++) 
		{
			a3[i+a1.length]=a2[i];
		}
		System.out.println(Arrays.toString(a3));
		
	
	}

}
