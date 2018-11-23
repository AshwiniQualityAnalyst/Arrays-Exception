package Arrays;

public class Testarray {

	public static void main(String[] args) {

		try {
			int array[] = new int[5];
			array[0] = 1;
			array[1] = 2;
			array[2] = 3;
			array[3] = 4;
			array[4] = 5;
			//array[5] = 6;
			for(int i=0; i<=array.length; i++) {
				System.out.println("Print array: "+array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Print1: "+e.getMessage());
			System.out.println("Print2: "+e.getCause());
			System.out.println("Print3: "+e.toString());
		}

		//After exception handling it will below code will work fine
		System.out.println("Rest of the code");
	}
}
