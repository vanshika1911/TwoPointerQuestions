package twoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class PairswithgivensumII {
	
	public static int solve(int[] A, int B) {
		
		int count=0;
		int j=A.length-1;
		int i=0;
		while(i < j) {

			if(A[i]+A[j] == B) {
			
				if(A[i]+A[j-1]  > B)
					j--;
				else if(A[i]+A[j-1]  < B)
					i++;
				else {
					count++;
					
				}
				
			    if(A[i+1]+A[j]  == B)
			    	count++;
			}
			else if(x+y < B) {
				j--;
			}
			else {
				i++;
			}
		}
		return count;
	
	}

	public static void main(String[] args) {
		int[] A= {1,1,1};
		int B=2;
		System.out.println(solve(A, B));
		

	}

}
