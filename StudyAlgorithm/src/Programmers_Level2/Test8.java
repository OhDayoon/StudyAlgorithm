package Programmers_Level2;

import java.util.Arrays;

public class Test8 {
	// 땅따먹기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int solution(int[][] land) {
        int answer = 0;
        // 같은 열을 연속해서 밟을 수 없는 특수 규칙이 있으므로
        // for문을 반복할 때 같은 열을 제외한 값에서 최대값을 더해준다.
        for(int i=1;i<land.length;i++){
             land[i][0]+=Math.max(Math.max(land[i-1][1],land[i-1][2]),land[i-1][3]);
             land[i][1]+=Math.max(Math.max(land[i-1][0],land[i-1][2]),land[i-1][3]);
             land[i][2]+=Math.max(Math.max(land[i-1][0],land[i-1][1]),land[i-1][3]);
             land[i][3]+=Math.max(Math.max(land[i-1][0],land[i-1][1]),land[i-1][2]);
        }
        int[] arr=land[land.length-1]; // 마지막 행만 새로운 배열로 생성
        Arrays.sort(arr);// 정렬
        
        answer=arr[arr.length-1]; // 최고점 도출

        return answer;
    }
}
