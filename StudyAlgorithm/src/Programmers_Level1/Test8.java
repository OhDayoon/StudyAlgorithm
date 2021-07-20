package Programmers_Level1;

public class Test8 {
	// 수박수박수박수박수박수?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public String solution(int n) {
	        String answer = "";
	        String s1="수",s2="박";
	        for(int i=0;i<n;i++){
	            if(i%2==0){
	                answer+=s1; // 짝수 순서에는 "수"
	            }
	            else{
	                answer+=s2; // 홀수 순서에는 "박"
	            }
	        }
	        return answer;
	    }
}
