package Programmers_Level2;

import java.util.*;

public class Test14 {
	// 위장(해시)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(String[][] clothes) {
        int answer = 1; // 아래에서 곱해주기 위해서 1로 설정
        HashMap<String,Integer> map=new HashMap<String,Integer>(); 
        // 옷 종류(key), 가짓수(values)

        for(int i=0;i<clothes.length;i++){
            String key=clothes[i][1]; // 키 설정
            map.put(key,map.getOrDefault(key,0)+1); // 존재하는 키라면 value값 1씩 증가, 없다면 0으로 설정
        }

        Set<String> keyset=map.keySet(); // 키값
        for(String key:keyset){
            answer*=map.get(key)+1; // 키와 매핑된 value값에 1 더해주기
        }
        return answer-1;
    }
}
