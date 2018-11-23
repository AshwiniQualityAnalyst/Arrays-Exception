package Arrays;

public class Testarray1 {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5};
		//Printing
		for(int i=0; i<array.length; i++) {
			System.out.print(+array[i]+" ");
		}
		
		//summing
		double total = 0;
		for(int i=0; i<array.length; i++) {
			total += array[i];
		}
		System.out.println(total);
	}
}
