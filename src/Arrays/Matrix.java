package Arrays;

public class Matrix {

	public static void main(String[] args) {
		int a[][] = {{1, 2, 3, 98}, {4, 5, 6, 99}, {7, 8, 9, 100}};
		int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		 int count = 0;  
	        for (int i=0; i<a.length; i++)  
	            for(int j=0; j<a[i].length; j++)  
	                a[i][j] = count++;  
	        
	       // int count = 0;  
	        for (int i=0; i<b.length; i++)  
	            for(int j=0; j<b[i].length; j++)  
	                b[i][j] = count++;  

		int c[][] = new int[3][4];
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				c[i][j] = a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}
