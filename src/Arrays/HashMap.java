package Arrays;

import java.util.*;

public class HashMap {

	public static void main(String[] args) {
		Map<Integer, String> hm = new java.util.HashMap<Integer, String>();

		hm.put(100,"Amit");  
		hm.put(101,"Vijay");  
		hm.put(102,"Rahul");
		System.out.println(hm);

		for( Map.Entry<Integer, String> m : hm.entrySet() )
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}

}
