package Programmers_Level2;

public class Test7 {
	// 숫자의 표현
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int n) {
        int answer=0;
        
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=i;j<=n;j++){ // 연속된 합이 n과 동일한지를 알아야한다.
                sum+=j;
                
                if(sum==n){ // 더한 값이 n과 동일하다면
                    answer++; // 개수 증가
                    break; // 반복문 탈출
                }
                else if(sum>n){ // sum이 n을 증가해도 
                    break; // 반복문 탈출
                }
            }
        }
        

        return answer;
    }
}
