package main;

import java.util.*;

public class test {
	public static void main(String[] args) {
		int[] li = {1, 2, 2, 3, 3, 3, 4};
        List<Integer> arrayList = new ArrayList<>();
        for(int v : li) {
            arrayList.add(v);
        }

        List<Integer> rtemp = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arrayList) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
                rtemp.add(num * countMap.get(num));
            } else {
                countMap.put(num, 1);
                rtemp.add(num);
            }
        }

        // Menampilkan nilai yang berulang
        System.out.println("Nilai yang berulang dalam list:");

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
            }
        }
		
		System.out.println("result : " + rtemp);
	}
}