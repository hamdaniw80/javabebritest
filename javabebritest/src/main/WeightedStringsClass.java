package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class WeightedStringsClass {
    
    static List<String> charScore(String c, int[] li) {

    	// declare variable for result and getting value int from string or char
    	List<String> result = new ArrayList<>(); 
    	List<Integer> valueString = new ArrayList<>(); 
    	int strTemp = 0;
    	for (int i = 0; i < c.length(); i++) {
    		strTemp = c.charAt(i) - 'a' + 1;
    		valueString.add(strTemp);
    	}
    	
    	// getting sum value from substring char
    	List<Integer> sumValueString = new ArrayList<>();
    	HashMap<Integer, Integer> countMap = new HashMap<>();
    	for (int num : valueString) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
                sumValueString.add(num * countMap.get(num));
            } else {
                countMap.put(num, 1);
                sumValueString.add(num);
            }
        }
    	
    	// convert int value compare from int list tp array list
    	List<Integer> compareIntTemp = new ArrayList<>();
    	for (int v : li) {
    		compareIntTemp.add(v);
    	}
    	
    	// get result from compare int queries with sum value from substring char
    	for (Integer value : compareIntTemp) {
            if (sumValueString.contains(value)) {
            	result.add("YES");
            } else {
            	result.add("NO");
            }
        }
    	
    	// print out for each parsed value
    	System.out.println("string input : "+c);
		System.out.println("value string : "+valueString);
    	System.out.println("value sum string : "+sumValueString);
    	System.out.println("compare int : "+ compareIntTemp);
    	
    	return result;
    }
 
    public static void main(String []args)
    {
    	// declare input
        String c = "abbcccd";
        int[] li = {1, 3, 9, 8};
        
        // print out result with calling function
        System.out.println(charScore(c, li));

    }
}
