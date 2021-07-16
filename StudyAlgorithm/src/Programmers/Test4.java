package Programmers;

public class Test4 {
	// 문자열 내 p와 y의 개수
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 boolean solution(String s) {
	        boolean answer = true;

	        String change=s.toLowerCase();
	        
	        int pcnt=0,ycnt=0;
	        
	        for(int i=0;i<change.length();i++){
	            if(change.charAt(i)=='p'){
	                pcnt++;
	            }
	            else if(change.charAt(i)=='y'){
	                ycnt++;
	            }
	        }
	        
	        if(pcnt==ycnt){
	            answer=true;
	        }
	        else{
	            answer=false;
	        }
	        return answer;
	    }
}
