package Programmers_Level2;

import java.util.Arrays;

public class Test6 {
	// 최댓값과 최솟값 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String s) {
        String answer = "";
        String[] arr=s.split(" "); // 공백으로 쪼개기
        
        int[] iarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            iarr[i]=Integer.parseInt(arr[i]); // 숫자로 변경
        }
        Arrays.sort(iarr); // 숫자로 변경된 배열을 정렬
        
        StringBuilder sb= new StringBuilder();
        sb.append(iarr[0]); // 최솟값
        sb.append(" "); // 공백
        sb.append(iarr[iarr.length-1]); // 최댓값
        
        return sb.toString();
    }
}
