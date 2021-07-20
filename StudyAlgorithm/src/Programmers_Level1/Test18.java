package Programmers_Level1;

public class Test18 {

	public static void main(String[] args) {
	
	}
	public String solution(String new_id) {

        String id=new_id.toLowerCase();// 소문자로 변환
        String answer="";
        
        for(int i=0;i<id.length();i++){
            char ch=id.charAt(i);
            
            if(ch>='0'&&ch<='9'){ // 0~9
                answer+=String.valueOf(ch);
            }
            else if(ch>='a'&&ch<='z'){ // a~z
                answer+=String.valueOf(ch);
            }
            else if(ch=='-'||ch=='_'||ch=='.'){ // -,_,.
                answer+=String.valueOf(ch);
            }
        }
        answer=answer.replaceAll("[.]{2,}","."); // ..을 .으로 대체
        
        if(answer.charAt(0)=='.'){
            answer=answer.substring(1,answer.length());
        }
        else if(id.charAt(id.length()-1)=='.'){
            answer=answer.substring(0,answer.length()-1);
        }
        
        if(answer.length()==0){
            answer+="a"; // 빈문자열이면 a로 변환
        }
        
        if(answer.length()>=16){
            answer=answer.substring(0,15);
        }
        
        if(answer.charAt(answer.length()-1)=='.'){
            answer=answer.substring(0,answer.length()-1);
        }
        if(answer.length()<=2){
            while(answer.length()<3){
                answer+=String.valueOf(answer.charAt(answer.length()-1));
            }
        }
        return answer;
        
        /*
        String id = new_id.toLowerCase(); // 소문자로 
        id = id.replaceAll("[^-_.a-z0-9]", ""); //-_. 영문자 숫자만 남김 
        id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로 
        id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 . 제거 

        if(id.equals("")) // 빈 문자열이라면 a 추가 
            id += "a";
            
        if(id.length() >= 16){ // 16자 이상이면 15자로 
            id = id.substring(0, 15);
            id = id.replaceAll("^[.]|[.]$", ""); // 끝 . 제거 
        }
        if(id.length() <= 2) // 2자 이하라면 3자까지 마지막 문자추가 
            while(id.length() < 3)
                id += id.charAt(id.length() - 1);

        return id;
         */
    }
}
