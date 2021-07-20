package Programmers_Level1;

import java.util.ArrayList;

public class Test1 {

	public int[] solution(int []arr) {
        
        ArrayList<Integer> tlist=new ArrayList<Integer>(); // 새로운 리스트 생성
        int idx=10;// 숫자는 0~9까지 이기 때문에 존재하지 않는 숫자 10으로 먼저 설정 
        for(int i=0;i<arr.length;i++){
            if(idx!=arr[i]){ // 연속되는 숫자와 동일하지 않을 때
                tlist.add(arr[i]); // 리스트에 추가
                idx=arr[i];
            }
        }
        int[] answer = new int[tlist.size()]; // 리스트 사이즈가 answer 배열의 크기가 된다.
        
        for(int i=0;i<answer.length;i++){
            answer[i]=tlist.get(i);
        }
        return answer;
    }
}
