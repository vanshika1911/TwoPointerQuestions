package twoPointers;

public class AnotherCountRectangles {
	
	private static int solve(int[] A, int B) {
		
		int n=A.length;
        int j=n-1;
        long ans=0;
        int i=0;
        while(i < n && j >= 0){
            
            long area=(long)A[i] * (long)A[j];
            if(area >= B){
             j--;
            }
             else{
             ans+=j+1;
              i++;
             }
        }
        int mod=(int)(Math.pow(10,9)+7);
        return (int)ans%mod;
	}

	public static void main(String[] args) {
		int[] arr = {5,10,20,100,105};
		int B=110;
		System.out.println(solve(arr,B));
	}
}
