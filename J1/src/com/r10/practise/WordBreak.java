package com.r10.practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
        return wordBreakHelper(s, dict, 0);
	}

	public boolean wordBreakHelper(String s, Set<String> dict, int start){
	   if(start == s.length()) 
	       return true;
	
	   for(String a: dict){
	       int len = a.length();
	       int end = start+len;
	
	       //end index should be <= string length
	       if(end > s.length()) 
	           continue;
	
	       if(s.substring(start, start+len).equals(a))
	           if(wordBreakHelper(s, dict, start+len))
	               return true;
	   }
	
	   return false;
	}

	
	
	public static void main(String[] args) {
		WordBreak wb = new WordBreak();
		
		String s = "你想拉屎不";
		Set<String> dict = new HashSet<>();
		String[] strs = {"我", "你", "不", "喜欢", "拉屎", "想", "特"};
		for (String ss : strs) {
			dict.add(ss);
		}
		
		System.out.println(Arrays.toString(strs));
		System.out.println(dict.toString());
		System.out.println(wb.wordBreak(s, dict));
		
	}
}



