package Arrays;

public class StringOrdering {
	static String name[] = {"Madras", "Bombay", "Delhi", "Andhra", "Calcutta"};
	public static void main(String[] args) {
		int size = name.length;
		String Temp = null;

		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(name[j].compareTo(name[i]) > 0)
				{
					Temp = name[i];
					name[i] = name[j];
					name[j] = Temp;
				}
			}
		}
		//Print now

		for(int i=0; i<size; i++)
		{
			System.out.print(name[i]+" ");
		}

	}

}
