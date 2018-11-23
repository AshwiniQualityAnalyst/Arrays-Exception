package Exceptions;

public class TestMultipleCatchBlock {

	public static void main(String[] args) {
		try
		{
			int a[] = new int[4];
			a[5] = 30;
			int b = 30 /0 ;
			System.out.println(b);
		}
		catch (ArithmeticException e)  	
		{
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
	}

}
