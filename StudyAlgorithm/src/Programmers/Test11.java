package Programmers;

public class Test11 {
	// 소수 개수 찾기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int solution(int n) {
	        int answer = 0;
	        // 0과 1은 소수가 될 수 없으므로 i값은 2부터 시작해야한다.
	        for(int i=2;i<=n;i++){
	            if(i==2){ // 2는 소수
	                answer++;
	                continue;
	            }
	            if(i%2==0) continue; // 2의 배수는 소수가 될 수 없다.
	            
	            boolean flag=true; // 소수 판별하기
	            
	            for(int j=3;j<=Math.sqrt(i);j+=2){ //4,6은 2의 배수로 소수가 아니기때문에 j++가 아닌 2만큼 증가
	            	
	                if(i%j==0){ // 나머지가 0이 되면 소수가 아니다.
	                    flag=false;
	                    break;
	                }
	            }
	            
	            if(flag){ // flag 가 true가 되면 소수라는 뜻이므로
	                answer++; // 수 증가
	            }
	        }
	        
	        return answer;
	    }
}
