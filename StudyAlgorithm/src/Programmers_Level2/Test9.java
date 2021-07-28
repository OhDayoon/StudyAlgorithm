package Programmers_Level2;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	      
	        String s =Integer.toBinaryString(n);// 2진수로 숫자 변환
	        
	        int cnt=0;
	        for(char c: s.toCharArray()){ // 스트링으로 변환된 것을 char타입 배열로 변경
	            if(c=='1') cnt++;// 각 배열마다 1이 나올 경우 cnt증가
	        }
	        
	        
	        for(int i=n+1;i<=1000000;i++){ // n의 다음 큰 숫자가 나올때까지 반복
	            int count=0;
	            String s1=Integer.toBinaryString(i); // n보다 큰 수를 2진수로 변환
	             for(char c: s1.toCharArray()){
	                 if(c=='1') count++;
	             }
	            
	            if(cnt==count){ // 처음 주어진 자연수의 1의 개수와 n보다 큰 수의 1의 개수가 동일할 때
	                answer=i; // i값(n의 다음 큰 숫자) 리턴
	                break;// 반복문 중단
	            }
	        }
	        return answer;
	    }
	}
}
