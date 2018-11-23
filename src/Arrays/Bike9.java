package Arrays;

class Bike
{
	final void run()
	{
		System.out.println("Ashwini");
	}

	void gun() 
	{
		System.out.println("Ashwini1");
	}
}

public class Bike9 extends Bike
{
	final int SpeedLimit = 90;
	Bike B = new Bike();
	void gun()
	{
		System.out.println("ok");
	}



	public static void main(String[] args) {

		Bike B = new Bike();
		B.run();
	}

}
