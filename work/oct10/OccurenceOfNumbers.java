package work.oct10;

import java.util.Map;
import java.util.TreeMap;

public class OccurenceOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 2, 3, 2, 4, 5 };
        // 1->1
        // 2-->3
        // 3-->2
        // 4-->1
        // 5-->1
       // Map<Integer, Integer> numbers = new TreeMap<Integer, Integer>();
      /*  for (int i = 0; i < arr.length; i++) {
            if (!numbers.containsKey(arr[i])) {
                // checks for the key in the map
                // if not present -->add the key into the map and count 1
                numbers.put(arr[i], 1);
            } else {
                // gets the count of the already occured key
                Integer value = numbers.get(arr[i]); // 2-->1
                // now the key along with second occurence added to the map
                numbers.put(arr[i], value + 1);
            }
            System.out.println(numbers);
            */
            //method2
            Map<Integer, Integer> number = new TreeMap<Integer, Integer>();
            
            for(int j=0;j<arr.length;j++) {
                number.put(arr[j], number.getOrDefault(arr[j], 0)+1);
            }
            
            System.out.println(number);
        
	}

}
