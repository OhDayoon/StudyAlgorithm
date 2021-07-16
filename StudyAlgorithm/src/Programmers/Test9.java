package Programmers;

public class Test9 {
	// 문자열을 정수로 바꾸기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(String s) {
        int answer = 0;
        
        if(s.length()>=1 && s.length()<=5){ // 문자열 길이: 1~5
            if(s.charAt(0)!='0'){ // 처음 시작하는 값이 0이 아닐 때
                answer=Integer.parseInt(s); // 문자열을 정수로 변환
            }
        }
        return answer;
    }
}
