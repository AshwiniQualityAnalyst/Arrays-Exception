package Arrays;

public class Check {

	public static void main(String[] args) {
		double a[] = {1.9, 2.9, 3.9};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int total =0;
		for(int i=0; i<a.length; i++) {
			total +=a[i];
		}
		System.out.println(total);
		
		// Finding the largest element
		 double max = a[0];
		 for(int i=0; i<a.length; i++) {
			 if(max < a[i]) {
				 max = a[i];
			 }
			 System.out.println(max);
		 }
		 

	}

}
