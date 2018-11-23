package Arrays;

public class Testarray3 {

	public static void main(String[] args) {

		int array[][] = {{1, 2, 3}, {7, 8, 9}, {13, 14, 15 }};
		//System.out.println(array.length);

		//System.out.println(array[0][0]);
		//System.out.println(array[0][1]);
		//System.out.println(array[0][2]);

		//System.out.println(array[0][3]);
		/*

			0,0	0,1	0,2     //Array Indexing
			1,0	1,1	1,2
			2,0 2,1 2,2

		 */

		for(int i=0; i<array.length; i++) {

			for(int j=0; j<array[i].length; j++ ) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		//declaration and initialization of array  
		int arr[]={4,4,5};  
		//getting the class name of Java array  
		Class c=arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(name);  


	}

}
