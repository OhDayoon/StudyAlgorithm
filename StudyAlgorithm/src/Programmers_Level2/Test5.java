package Programmers_Level2;

import java.util.Arrays;

public class Test5 {
	// 최솟값 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int []A, int []B)
    {
        int answer=0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        int[] rb=new int[B.length];
        // 두개의 배열에 있는 수를 곱해서 최솟값을 구하기 위해서는 작은 수*큰수를 해야 최솟값을 도출할 수 있다.
        
        for(int i=0;i<B.length;i++){
            rb[i]=B[(B.length-1)-i];
        }
        
        for(int i=0;i<A.length;i++){
            answer+=A[i]*rb[i];
        }
        return answer;
    }
}
