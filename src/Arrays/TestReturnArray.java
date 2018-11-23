package Arrays;

public class TestReturnArray {

	public static void main(String[] args) {
		int array[] = get();
		for(int i=0; i <array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static int[] get() {
		return new int[] {10, 20, 30, 40, 50};
	}
}
