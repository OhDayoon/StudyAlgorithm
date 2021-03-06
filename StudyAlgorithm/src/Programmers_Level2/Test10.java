package Programmers_Level2;

import java.util.*;

public class Test10 {

	public static void main(String[] args) {
		int[] arr= {6,10,2};
		solution(arr);
		System.out.println(solution(arr));

	}
	 public static String solution(int[] numbers) {
	        String answer = "";
	        String[] arr=new String[numbers.length];
	        for(int i=0;i<numbers.length;i++){
	            arr[i]=String.valueOf(numbers[i]); // 숫자를 문자열로 변경
	        }
	        
	        Arrays.sort(arr,new Comparator<String>(){
	            @Override
	            public int compare(String s1,String s2){
	              //  System.out.println("내림차순"+s2+s1);
	              //  System.out.println("오름차순"+s1+s2);
	                return (s2+s1).compareTo(s1+s2); // 내림차순
	            }
	        });
	        
	        if("0".equals(arr[0])){
	            return "0";
	        }
	        else{
	            for(String a:arr){
	                answer+=a;
	            }
	        }
	        return answer;
	    }
}
