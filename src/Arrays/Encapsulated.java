package Arrays;

class Encapsulated 
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

class Test
{
	public static void main(String[] args) {
		Encapsulated e = new Encapsulated();
		e.setName("Ashwini");
		System.out.println(e.getName());
	}
}
