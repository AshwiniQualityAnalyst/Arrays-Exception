package Arrays;

class Family
{
	public int id;
	public String name;

	Family(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class Arrays2 
{
	public static void main(String[] args) 
	{
		Family[] array = new Family[3];
		array[0] = new Family(1, "a");
		array[1] = new Family(2, "b");
		array[2] = new Family(3, "c");

		for(Family f : array)
		{
			System.out.println(f.id+ " "+f.name);
		}

	}
}
