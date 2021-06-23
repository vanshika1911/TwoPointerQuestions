package twoPointers;

import java.util.Arrays;

public class PairsWithGivenDifference {
	
	private static int solve(int[] A, int B) {
		
		//Two Pointer
		Arrays.sort(A);
		int count=0;
		int j=1;
		int i=0;
		while(j < A.length) {
			
			if( i == j) {
				j++;
				continue;
			}
			int x = A[i];
			int y = A[j];
			
			if(y-x == B) {
				count++;
				while(i < A.length && A[i] == x)
					i++;
				while(j < A.length && A[j] == y)
					j++;
			}
			else if(y-x < B) {
				j++;
			}
			else {
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		//int[] A= {1,1,1,2,2};
		int[] A= {8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3};
		int B=3;
		System.out.println(solve(A, B));
	}
}
