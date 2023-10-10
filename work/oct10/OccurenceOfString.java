package work.oct10;

import java.util.Map;
import java.util.TreeMap;

public class OccurenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "Raghu","Dilip","Vidya","Aruna","Meera","Dilip","Aruna" };
        Map<String, Integer> number = new TreeMap<String, Integer>();
            
            for(int j=0;j<arr.length;j++) 
            {
                number.put(arr[j], number.getOrDefault(arr[j], 0)+1);
            }
            System.out.println(number);
        }

}
