package twoPointers;

public class TwoSum {
	
	private static void twoSum(int[] A, int target) {
		
		int i=0;
		int j=A.length-1;
		int[] arr = new int[2];
		int global_i=0;
		int global_j=0;
		
		while(i < j) {
			
			System.out.println(A[i]+" "+A[j]);
			if(A[i]+A[j] > target) {
				j--;
			}
			else if(A[i]+A[j] < target) {
				i++;
			}
			else {
				if(global_j > j) {
					global_j=j;
				}
				if(global_i < i) {
					global_i=i;
				}
				i++;
				j--;
				
			}
		}
		arr[0]=global_i;
		arr[1]=global_j;
	
		for(Integer num :arr)
			System.out.println(num);
		
	}

	public static void main(String[] args) {
		int[] A= { 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
		int target =-3;
		twoSum(A, target);
	}
}
