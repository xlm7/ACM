package com.xlm.leetcode;

public class Solution {
	
	 public static int maxArea(int[] height) {
	        int maxarea = 0;
	        int low=0,high=height.length-1;
	        int k;
	        while(low<high){
	        	 maxarea = Math.max(maxarea, Math.min(height[low], height[high]) * (high - low));
	        	 if(height[low]<height[high]){
	        		 k=low;
	        		 while(k<high&&height[k]<=height[low])
	        			 k++;
	        		 low=k;
	        		
	        	 }else{
	        		 k=high;
	        		 while(k>low&&height[k]<=height[high])
	        			 k--;
	        		 high=k;
	        	 }
	        }
	        return maxarea;
	        
	    }
	public static void main(String[] args) {
		int[]height=new int[]{2,3,4,5,18,17,6};
		System.out.println(maxArea(height));

	}

}
