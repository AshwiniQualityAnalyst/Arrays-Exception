package Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int number[] = {55, 40, 80, 65, 71};
		int length = number.length;
		System.out.println("Given list");

		for(int i=0; i<length; i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		System.out.println();

		//Sorting begins

		for(int i=0; i<length; i++) 
		{
			for(int j=i+1; j<length; j++) 
			{

				if(number[i] < number[j])
				{
					//Interchange values
					int Temp = number[i];
					number[i] = number[j];
					number[j] = Temp;
				}
			}
		}//Sorting ends
		System.out.println("Sorted list");
		for(int i=0; i<length; i++) {
			System.out.print(number[i]+" ");
		}
		

	}

}
