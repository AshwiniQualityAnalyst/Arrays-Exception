package Arrays;

public class Testarray2 {

	public static void main(String[] args) {
		int array[] = {20, 21, 22, 23, 19};
		min(array);
	}

	static void min(int arr[]) {
		int min = arr[0]; //Here arr[0] = 20;
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i]) {
				//20 > 21---fail
				//20 > 22---fail
				//20 > 23 ---fail
				//20 > 19 ---pass
				min = arr[i];
			  //min = 19---Satisfied
			}
		}
		System.out.println("print min: "+min);
	}

}
