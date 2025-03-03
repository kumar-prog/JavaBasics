
public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,3,9,6};
		int sum=0;
		int avg=0;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/5;
			
		}
		System.out.println(avg);
	}

}
