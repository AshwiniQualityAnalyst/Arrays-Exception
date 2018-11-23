package Exceptions;

public class TestMultipleCatchBlock1 {

	public static void main(String[] args) {

		try
		{
			int a[] = new int[2];
			a[3] = 2;
			int b = 2/0;
			System.out.println(b);
		}

		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");


	}

}
