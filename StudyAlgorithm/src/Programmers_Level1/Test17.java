package Programmers_Level1;

import java.util.Arrays;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d); // 오름차순 정렬
	        for(int i=0;i<d.length;i++){
	            budget-=d[i];
	            if(budget<0) break; // 예산이 0 미만이 되면 반복문 탈출
	            answer++;
	        }
	        
	        return answer;
	    }
}
