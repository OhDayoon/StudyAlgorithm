package Programmers_Level1;

public class Test10 {
	// 시저암호
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
           char alpa= s.charAt(i);
            
           if(alpa >='a'&&alpa<='z'){ // 소문자인 경우
               if(alpa+n>'z'){ // 더했을 때 z를 넘어가면
                   answer+=(char)(alpa+n-26); // 다시 마이너스 26
               }
               else{
                   answer+=(char)(alpa+n);
               }
           } 
           else if(alpa>='A' && alpa<='Z'){ // 대문자인 경우
               if(alpa+n>'Z'){
                   answer+=(char)(alpa+n-26);
               }
               else{
                   answer+=(char)(alpa+n);
               }
           }
            else if(alpa==' '){ // 띄어쓰기인 경우
                answer+=" ";
            }
        }
        return answer;
    }
}
