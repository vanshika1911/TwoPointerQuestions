package twoPointers;

public class MaxContinuousSeriesof1s {

	private static void solve(int[] A, int B) {

		int start=0;
		int end=0;
		int n=A.length;
		int max_length=Integer.MAX_VALUE;
		int count=0;
		int ans=0;

		while(end <n) {

			if(A[end] == 1) {
				ans++;
				end++;
			}
			if(A[end] == 0) {

				if(count <= B) {
					count++;

					ans++;
					end++;
				}
			}

			if(count > B) {
				while(count > B) {
					if(A[start] == 1)
						start++;
					else {
						start++;
						count--;

						int len = end-start;
						if(ans > len) {
							len=ans;
							max_length=ans;
							ans=0;
						}
						else {
							max_length=len;
						}

					}
				}
			}


		}
		System.out.println(max_length);
		//System.out.println(global_start+"  "+global_end);

	}

	public static void main(String[] args) {
		int[] A = {1, 0, 0, 0, 1, 0, 1};
		int B=2;
		solve(A,B);
	}
}
