package Arrays;

import java.awt.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		//creating Hashtable for sorting

		Map<String, Integer> olympics2012 = new HashMap<String, Integer>();
		olympics2012.put("England", 3);
		olympics2012.put("USA", 1);
		olympics2012.put("China", 2);
		olympics2012.put("Russia", 4);
		
		//printing hashtable without sorting
		System.out.println(olympics2012);
		
		//Map<String, Integer> sorted = sort
	}
	
	public static <K extends Comparable,V extends Comparable> Map<K,V> sortByKeys(Map<K,V> map){
        list<K> keys = new LinkedList<K>(map.keySet());
        Collections.sort(keys);
      
        //LinkedHashMap will keep the keys in the order they are inserted
        //which is currently sorted on natural ordering
        Map<K,V> sortedMap = new LinkedHashMap<K,V>();
        for(K key: keys){
            sortedMap.put(key, map.get(key));
        }
      
        return sortedMap;
    }

}
