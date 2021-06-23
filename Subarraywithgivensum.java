package twoPointers;

public class Subarraywithgivensum {
	
	private static int[] solve(int[] A, int B) {
		
		 int n=A.length;
	        int current=0;
	        int j=0;
	        for(int i=0;i<n;i++){
	            current +=A[i];
	            while(current > B){
	                current-=A[j];
	                j++;
	            }
	            if(current == B){
	            	System.out.println("hello");
	                int m=0;
	                int[] arr = new int[i-j+1];
	                System.out.println(i+" "+j+" "+arr.length);
	                for(int k=j;k<=i;k++){
	                    arr[m]=A[k];
	                    m++;
	                }
	                return arr;
	            }
	        }
	        int[] arr1 = new int[1];
	                arr1[0]=-1;
	                return arr1;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int B=5;
		int[] A=solve(arr,B);
		for(int i:A)
			System.out.println("arr"+i);
	}
}
