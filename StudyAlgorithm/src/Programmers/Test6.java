package Programmers;

public class Test6 {
	// 문자열 다루기 기본
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4||s.length()==6){ // 문자열 4글자 혹은 6글자만
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)-48)>=0 && (s.charAt(i)-48)<=9){ // 문자열이 숫자만 포함되어야 한다.
                    answer=true;
                }
                else{
                    answer=false; // 숫자가 아닐 때 false값이 리턴되어야 한다.
                    break; // 빠져나가기
                }
            }
        }
        else{
            answer=false;
        }
        return answer;
    }
}
