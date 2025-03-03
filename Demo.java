package Inheritance;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvCalc c= new AdvCalc();
		int r1=c.add(3, 5);
		int r2= c.sub(8, 5);
		int r3= c.mul(8, 5);
		int r4= c.div(8, 5);
		System.out.println(r1 +" " +r2 +" "+r3+" "+r4);
	}

}
