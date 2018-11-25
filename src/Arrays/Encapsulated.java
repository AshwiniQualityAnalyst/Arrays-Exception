//the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class

//in which they are declared.

//As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.

//Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the

//class to set and get the values of variables.

package Arrays;

class Encapsulate {

	private int Age;
	private String Name;
	private int Roll;

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int Roll) {
		this.Roll = Roll;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Encapsulate Object = new Encapsulate();
		Object.setName("Ashwini");
		System.out.println(Object.getName());

		Object.setAge(30);
		System.out.println(Object.getAge());

		Object.setRoll(10645280);
		System.out.println(Object.getRoll());
	}
}
