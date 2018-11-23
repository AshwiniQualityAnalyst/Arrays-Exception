package Arrays;

class person
{
	int id;
	String name;

	person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

class Emp extends person
{
	float salary;
	Emp(int id, String name, float salary) 
	{
		super(id, name);
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println(id+ " "+name+" "+salary);
	}
}

public class TestSuper5 
{
	public static void main(String[] args) 
	{
		Emp e = new Emp(1, "a", 2.4f);
		e.display();
	}

}
