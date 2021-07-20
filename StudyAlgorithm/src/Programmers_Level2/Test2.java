package Programmers_Level2;

public class Test2 {
	//JadenCase 문자열 만들기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String s) {
	      
		StringBuilder sb= new StringBuilder();
        
        String first=s.charAt(0)+""; // char타입에서 문자열""을 더해주면 문자열로 형변환됨
        sb.append(first.toUpperCase());// 첫문자는 대문자
        
        for(int i=1;i<s.length();i++){
            String ch=s.charAt(i)+"";
            if(ch==" "){ // 공백일 경우
                sb.append(" ");
            }
            else{
                if(s.charAt(i-1)==' '){ // 현재 문자 전에 공백이라면
                    sb.append(ch.toUpperCase()); // 현재 문자를 대문자로 변경
                }
                else{ // 그렇지 않다면
                    sb.append(ch.toLowerCase()); // 소문자로 변경
                }
            }
        }
        return sb.toString();
			
    }
}
