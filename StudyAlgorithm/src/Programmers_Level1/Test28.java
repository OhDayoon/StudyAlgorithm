package Programmers_Level1;

import java.util.Arrays;
import java.util.HashMap;

public class Test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String solution(String[] participant, String[] completion) { 
		String answer = ""; 
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
               return participant[i];
            }
        }
        return participant[i];
	}
        /*
		// 1. Create HashMap 
		HashMap<String, Integer> hm = new HashMap<>(); 
		// String:선수이름, Integer: index값
		 * 
		// 2. Add Participant to HashMap 
		for (String player : participant) 
		hm.put(player, hm.getOrDefault(player, 0) + 1); 
		getOrDefault: 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
                      HashMap의 경우 동일 키 값을 추가할 경우 Value의 값이 덮어쓰기가 됩니다.
		getOrDefault(Object key, V DefaultValue)
		매개 변수 : 이 메서드는 두 개의 매개 변수를 허용합니다.
		
		key : 값을 가져와야 하는 요소의 키입니다.
		defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.
		반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환됩니다.

		
		// 3. Subtract Completed participants from HashMap 
		for (String player : completion) hm.put(player, hm.get(player) - 1); 
		완주했다면 해쉬맵 키 값에서 -1해주기
		
		// 4. Find non-zero participant 
		for (String key : hm.keySet()){ 해쉬맵 키값에 대한 반복문
			if (hm.get(key) != 0){ 
				answer = key; 
				break; 
			} 
		} 
		return answer; 
	*/

	// 출처: https://coding-grandpa.tistory.com/entry/프로그래머스-완주하지-못한-선수-해시-Lv-1 [코딩하는 할아버지]
}
