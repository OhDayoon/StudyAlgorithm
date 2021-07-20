package Programmers_Level1;

import java.util.Arrays;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // commands 배열의 길이
        
        for(int i=0;i<commands.length;i++){
            int k=0;
            int[] arr= new int[commands[i][1]-(commands[i][0]-1)]; // commands[i][0]번째 ~ commands[i][1]번째
            
            for(int j=commands[i][0]-1;j<=commands[i][1]-1;j++){
                arr[k]=array[j]; // 새로운 배열 생성
                k++;
            }
            Arrays.sort(arr); // 오름차순
            answer[i]=arr[commands[i][2]-1];
            
        }
        return answer;
    }
}
