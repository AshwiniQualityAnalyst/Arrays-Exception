package Arrays;

public class Testarray5 {

	public static void main(String[] args) {
		int Array1[][] = {{1, 3, 4}, {3, 4, 5}};
		int Array2[][] = {{1, 3, 4}, {3, 4, 5}};
		//Printing Array1
		for(int i=0; i<Array1.length; i++) {
			for(int j=0; j<Array1[i].length; j++) {
				System.out.print(Array1[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println();
		//Printing Array2
		for(int k=0; k<Array2.length; k++) {
			for(int l=0; l<Array2[k].length; l++) {
				System.out.print(Array2[k][l]+" ");
			}
			System.out.println();
		}
		System.out.println();

		//Adding
		int Array3[][] = new int[2][3];
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				Array3[i][j]=Array1[i][j] + Array2[i][j];
				System.out.print(Array3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
