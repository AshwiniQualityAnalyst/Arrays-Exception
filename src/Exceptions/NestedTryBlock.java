package Exceptions;

public class NestedTryBlock {

	public static void main(String[] args) {

		//Parent start
		try 
		{
			//Child1
			try
			{
				int b = 39 / 0;
				System.out.println(b);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			//Child1

			//Child2
			try 
			{
				int a[] = new int[2];
				a[3] = 2;
				System.out.println(a[3]);
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e.getMessage());
			}
			//Child2
			System.out.println("Rest of the code");
			
			//Parent end
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Again Rest of the code");

	}

}
