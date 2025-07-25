package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=1;
		int z;
		System.out.println("The fibonacci series are:");
		System.out.println(x);
		System.out.println(y);
		for(int i=0;i<6;i++)
		{
		z=x+y;
		System.out.println(z);
		x=y;
		y=z;
	
	}
		
	}

}
