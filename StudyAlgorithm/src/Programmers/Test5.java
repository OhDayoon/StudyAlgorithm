package Programmers;

import java.util.*;

public class Test5 {
	// 문자열 내림차순으로 배치하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String s) {
        String answer = "";
        Character[] arr=new Character[s.length()];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i);
        }
        
        Arrays.sort(arr,Collections.reverseOrder()); // 내림차순하기
        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        return answer;
    }
}
