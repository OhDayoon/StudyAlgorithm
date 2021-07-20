package Programmers_Level1;

public class Test7 {
	// 서울에서 김서방 찾기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){  // index를 찾는 것이다.
                answer="김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }
}
