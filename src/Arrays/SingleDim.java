package Arrays;

public class SingleDim {

	public static void main(String[] args) {

		//int array[] = new int[5];
		//int array[] = {1, 2, 3, 4, 5};
		//int array[][] = new int[3][3];
		int SDarray[] = {1, 2, 3, 4, 5};
		int MDarray[][] = { {1, 2, 3, 98}, {4, 5, 6, 99}, {7, 8, 9, 100} };

		for(int i=0; i<SDarray.length; i++) {
			System.out.print(SDarray[i]+ " ");
			System.out.println();
		}
		System.out.println("Above Single Dimensional");
		System.out.println();
		

		for(int i=0; i<MDarray.length; i++) {
			for(int j=0; j<MDarray[i].length; j++) {
				System.out.print(MDarray[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Above Multi Dimensional");
	}

}
