package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		boolean Prime=true;
	for(int i=2;i<=n;i++)
	{
	if (n%i==0)
	Prime=false;
	break;
	}
	if(Prime) 
	 System.out.println(n+" "+"is a Prime number");
	 else 
		 System.out.println(n+" "+ "is not a prime number");
	}
}


