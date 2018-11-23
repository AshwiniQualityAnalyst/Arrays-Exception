package Arrays;

class Students
{
	public int rollno;
	public String name;

	Students(int rollno, String name) 
	{
		this.rollno = rollno;
		this.name = name;
	}
}
//Elements of array are objects of a class Student. 
public class Arrays {

	public static void main(String[] args) {

		Students[] arr = new Students[3];
		arr[0] = new Students(1, "A");
		arr[1] = new Students(1, "B");
		arr[2] = new Students(1, "C");

		for(Students a : arr) {
			System.out.println(a.rollno+ " "+a.name);
		}

	}

}
