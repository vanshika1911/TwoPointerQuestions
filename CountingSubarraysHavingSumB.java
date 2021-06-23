package twoPointers;

public class CountingSubarraysHavingSumB {
	
	private static void count(int[] A, int B) {
		
		int count=0;
	for(int i=0;i<A.length;i++) {
		
		for(int j=i+1;j<A.length;j++) {

				if(A[i]+A[j] <= B) {
					count++;
					j++;
				}
				else {
					i++;
				}
		}	
	}
	
	for(int i=0;i<A.length;i++) {
		if(A[i] < B)
			count++;
	}
	
		System.out.println(count);
	}

	public static void main(String[] args) {
		int [] A= {1, 11, 2, 3, 15};
		int B=10;
		count(A,B);
	}
}
