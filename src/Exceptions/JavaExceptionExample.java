package Exceptions;

public class JavaExceptionExample {

	public static void main(String[] args) {
		try
		{
			int data = 100;
			int b = data / 0;
			System.out.println(b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		System.out.println("Rest of the code");
		
		int q = 10;
		int p = 10;
		System.out.println(p+q);
		
		System.out.println("Rest of the code Again");
	}

}
