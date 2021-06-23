package twoPointers;

public class ClosestPairFromSortedArray {
	private static int[] solve(int[] A, int[] B, int C) {
	     
	    int diff = Integer.MAX_VALUE; 
	    
	    int[] arr = new int[2];
	           int m=A.length;
	           int n=B.length;
	     
	        int res_l = 0, res_r = 0; 
	        int l = 0, r = n-1; 
	        while (l<m && r>=0) 
	        { 
	        
	        	System.out.println(l+"   "+r);
	           if (Math.abs(A[l] + B[r] - C) < diff) 
	           { 
	               res_l = l; 
	               res_r = r; 
	               diff = Math.abs(A[l] + B[r] - C); 
	           }
	           if (Math.abs(A[l] + B[r] - C) == diff) 
	           { 
	               if(res_l >= l  && res_r >= r){
	               res_l = l;
	               res_r = r; 
	               diff = Math.abs(A[l] + B[r] - C); 
	               }
	           }
	
	           if (A[l] + B[r] > C) 
	               r--; 
	           else  // move to the greater side 
	               l++; 
	        } 
			arr[0]=A[res_l];
			arr[1]=B[res_r];
			
			return arr;
	}

	public static void main(String[] args) {
//		int [] A = { 6, 7, 9, 13, 21, 29, 56, 74, 77, 83, 84, 88, 93, 96, 101, 104, 114, 115, 122, 125, 144, 147, 151, 152, 154, 161, 165, 167, 174, 179, 185, 189, 192, 194, 198, 201, 203, 208, 224, 229, 230, 238, 252, 253, 257, 264, 266, 275, 278, 279, 282, 284, 291, 312, 316, 322, 332, 335, 336, 339, 364, 380, 381, 384, 387, 388, 390, 392, 394, 395, 401, 403, 431, 432, 440, 442, 443, 444, 446, 451, 454, 461, 470, 483, 492 };
//		int [] B = { 2, 8, 13, 16, 19, 21, 22, 23, 37, 48, 63, 66, 68, 71, 72, 95, 102, 116, 123, 127, 131, 132, 146, 148, 153, 171, 173, 179, 187, 194, 215, 220, 227, 229, 240, 245, 254, 255, 257, 259, 271, 276, 277, 286, 296, 312, 314, 318, 321, 333, 339, 341, 343, 355, 356, 359, 363, 364, 380, 390, 393, 398, 401, 409, 413, 417, 427, 442, 444, 446, 454, 455, 459, 460, 468, 471, 473, 475, 476, 478, 479, 482, 483, 488, 489 };
//		int C = 409;
		int[] A= {1};
		int[] B= {2,4};
		int C=4;
		
	  int[]  arr =solve(A,B,C);
	  for(Integer nums:arr)
		  System.out.println(nums);
	}
}
