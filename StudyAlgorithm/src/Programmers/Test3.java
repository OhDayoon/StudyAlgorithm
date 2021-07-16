package Programmers;

import java.util.*;

public class Test3 {
	// 문자열 내맘대로 정렬하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public String[] solution(String[] strings, int n) {
	        
	        Arrays.sort(strings,new Comparator<String>(){ // 문자열 정렬
	           @Override
	            public int compare(String s1,String s2){
	                char c1=s1.charAt(n); // n번째 문자
	                char c2=s2.charAt(n); // n번째 문자
	                 
	                if(c1==c2){ // n번째 문자가 동일하다면 사전적으로 비교해야한다.
	                    return s1.compareTo(s2);
	                }
	                else{// n번째 문자가 다르다면
	                    return c1-c2; // n번째 문자가 우선이 되어서 정렬된다.
	                }
	            }
	        });

	        return strings;
	    }
}
