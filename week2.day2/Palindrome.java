package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=25252;
		int temp=input;
		int output=0;
		int remainder;
		for(input=input;input>0;input=input/10)
		{
			remainder=input%10;
			output=(output*10)+remainder;
			}
		if(temp==output)
		{
			System.out.println("The number is palindrome");
		}
			else
			{
				System.out.println("The number is not palindrome");
		}
		

	}

}

