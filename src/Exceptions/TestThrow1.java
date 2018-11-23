package Exceptions;

public class TestThrow1 {

	public static void main(String[] args)
	{

		validate(101);
	}
	static void validate(int age) 
	{
		if(age < 18)
		{
			throw new ArithmeticException("It is not valid");
		}
		else if(age <= 19)
		{
			throw new ArithmeticException("You are good");
		}
		else if(age == 100)
		{
			throw new ArithmeticException("Poor you");
		}
		else
		{
			System.out.println("Go ahead");
		}
	}
}
