package com.sumit;

public class Solution {
	
    public static String longestCommonPrefix(String[] strs) {
    	
    	
    	/* compare first string from array with rest of the strings.
    	 * 
    	 *Condition 1:
    	 * But Constraint here is that we need to keep track of index
    	 * of first string and make sure it does not exceed the length 
    	 * of the other being compared to, else it will give arrayindexoutofbound exception.
    	 * 
    	 * so if the current index of first string is greater than the length of other string
    	 * being compared to, we would want to return the result we would already have at that
    	 * time.
    	 * 
    	 * Condition 2:
    	 * if current character of first string at an index is not present in the second string
    	 * at the same index then we would want to return the result that we already have.
    	 * 
    	 * There is no time complexity and space complexity constraints.
    	 * 
    	 * So this algorithm has time constraint of O(n^2) because of one nested for loop.
    	 * 
    	 * 
    	 */
    	
        String result = "";
    	
        if(strs==null || strs.length == 0){
            return result;
        }
        
    	String prefix = strs[0];
    	
    	//converting first input string from string array to character array
    	char[] charArray = prefix.toCharArray();
    	
    	//Iterating over characters of first string
    	for(int i =0 ;i<charArray.length;i++) 
    	{
    		//Iterating over other strings in string array
    		for(int j = 1; j<strs.length;j++) 
    		{
    			//checking condition 1 & condition 2 as mentioned above
    			if(i>=strs[j].length() || charArray[i] != strs[j].charAt(i)) 
    			{
    				//return the result we already have
    				return result;
    			}
    		}
    		
    		//adding the current character from character array pointer is pointing to.
    		result = result + charArray[i];
    	}
    	
    	return result;
   
    }
    
    public static void main(String[] args) {
		String [] str1 = {"flower","flow","flight"};
		String [] str2 = {"dog","racecar","car"};
		String [] str3 = {"","dog"};
		
		//first result
		System.out.println(Solution.longestCommonPrefix(str1));
		
		//second result
		System.out.println(Solution.longestCommonPrefix(str2));
		
		//third result
		System.out.println(Solution.longestCommonPrefix(str3));
	}

}
