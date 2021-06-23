package twoPointers;

public class ArrayThreePointer {
	
	private static void solve(int[] A, int[] B, int[] C) {
		int n1=A.length;
		int n2=B.length;
		int n3=C.length;
		
		int i=0;
		int j=0;
		int k=0;
		int max_diff=0;
		int max = Integer.MAX_VALUE;
		
		while(i< n1 && j<n2 && k<n3) {
			int diff1 =Math.abs(A[i]-B[j]);
			int diff2=Math.abs(B[j]-C[k]);
			int diff3=Math.abs(C[k]-A[i]);
			
			int ans = Math.max(diff2, diff3);
			max_diff = Math.max(diff1, ans);
			
			if(max > max_diff) {
				max=max_diff;
			}
			
			if(A[i] <= B[j] && A[i] <= C[k]) {
				i++;
			}
			else if(B[j] <= A[i] && B[j] <= C[k]) {
				j++;
			}
			else
				k++;
			
		}
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		int[] A= {1, 4, 10};
		int[] B= {2, 15, 20};
		int[] C= {10, 12};
		solve(A,B,C);
	}
}
