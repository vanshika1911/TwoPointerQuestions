package twoPointers;

import java.util.Arrays;

public class ThreeSum {
	
	private static int threeSumClosest(int[] A, int B) {
		
	    Arrays.sort(A);
	   // double result = A[0]+A[1] + A[A.length-1] ;
	    int result = Integer.MAX_VALUE;
	    
	    for(int i=0;i<A.length;i++){
	    	int left = i+1;
	        int right = A.length-1;
	        
	        while(left < right) {
	        	int sum=A[i] + A[left] +A[right];
	        	
	        	 if(A[i] + A[left] +A[right] < B) {    
	        		left++;
	        	}
	        	else {
        		    right--;
	        	}
	        	 
	        	 if(Math.abs(sum-B) < Math.abs(result-B))
	        		 result=sum;	
	        }
        	
	    }  
           return result;
	}

	public static void main(String[] args) {
		int [] A = {-10, -10, -10 };
		int B=-5;
		System.out.println(threeSumClosest(A,B));
	}
}
