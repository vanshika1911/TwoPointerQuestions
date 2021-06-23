package twoPointers;

import java.util.HashMap;

public class CountSubArrays {
	
	private static void count(int[] A) {
		
		int count=0;
		int n= A.length;
		HashMap<Integer,Integer> hm = new HashMap<>();
	
		int i=0;
		int j=0;
		while( j < n && i < n) {
			
			
			if(hm.containsKey(A[j])) {
				
				if(i < (hm.get(A[j]) +1))
					i=hm.get(A[j])+1;
				hm.remove(A[j]);
				
			}
			else {
				hm.put(A[j], j);
				count=count+(j-i)+1;
				j++;
			}
		}
		

		System.out.println(count);
		
	}
	public static void main(String[] args) {
		int[] A = {1,2,3,2,1};
//		int[] A = { 93, 9, 12, 32, 97, 75, 32, 77, 40, 79, 61, 42, 57, 19, 64, 16, 86, 47, 41, 67, 76, 63, 24,
//				    10, 25, 96, 1, 30, 73, 91, 70, 65, 53, 75, 5, 19, 65, 6, 96, 33, 73, 55, 4, 90, 72, 83, 54,
//				    78, 67, 56, 8, 70, 43, 63};
		count(A);
	}
}
