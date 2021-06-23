package twoPointers;

public class ContainerWithMostWater {

	public static int maxArea(int[] A) {
		
		int i=0;
		int j=A.length-1;
		int global_area=Integer.MIN_VALUE;
		int area=0;
		
		while(i <= j) {
			int min=Integer.min(A[i], A[j]);
			area=min*(j-i);
			if(global_area < area)
				global_area=area;
			
			if(A[i] < A[j])
				i++;
			else
				j--;
		}
		
		return global_area;
	}

	public static void main(String[] args) {
		int[] A= {1, 5, 4, 3};
		System.out.println(maxArea(A));
	}

}
