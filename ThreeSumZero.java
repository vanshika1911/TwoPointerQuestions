package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumZero {
	
	private static List<List<Integer>> threeSum(int[] nums) {
	     List<List<Integer>> res = new ArrayList<>();
	        List<Integer> list;
	              
	        Arrays.sort(nums);
	        
	        for(int i=0;i<nums.length;i++){
	        	
	        	if (i-1 >= 0 && nums[i] == nums[i-1])
	                continue;
	            int j=i+1;
	            int k=nums.length-1;
	            
	            while(j < k){
	            long sum = 0L +nums[i]+nums[j]+nums[k];
	            
	           if(sum == 0){
	        	   list=new ArrayList<>();
	               list.add(nums[i]);
	               list.add(nums[j]);
	               list.add(nums[k]);
	               res.add(list);
	               while (j + 1 < k && nums[j] == nums[j+1])
	                    j++;
	                    while (j < k-1 && nums[k] == nums[k-1])
	                        k--;
	               j++;
	               k--;
	           }
	           else if(sum < 0){
	               j++;
	           }
	            else
	               k--;
	          }   
	    } 
//	        System.out.println(res.size());
//	        for(int i=0;i<res.size();i++)
//	        System.out.println(res.get(i));
	      return res;
		
	}

	public static void main(String[] args) {
		//int[] nums = {-1,0,1,2,-1,-4};
		int[] nums = {2147483647, -2147483648, -2147483648, 0, 1};
		List<Integer> l = new ArrayList<>();
		List<List<Integer>> list =threeSum(nums);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
