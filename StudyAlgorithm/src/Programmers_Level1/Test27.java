package Programmers_Level1;

import java.util.ArrayList;

public class Test27 {
	// 소수 만들기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){ // 배열에서 세가지의 값을 더한다.(중복되지 않게)
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    list.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        boolean[] flag=new boolean[list.size()]; // 소수인지 아닌지 판별할 수 있는 boolean 배열 생성
        for(int i=0;i<list.size();i++){
            for(int j=2;j<list.get(i);j++){
                if(list.get(i)%j==0){ // 더한값을 2부터 나누어서 나머지값이 0이 된다면 소수가 아니다.
                    flag[i]=true; // 배열에 true값 지정
                    break;// 반복문 탈출
                }
            }
        } 

        for(int i=0;i<flag.length;i++){
            if(!flag[i]){ // flag배열에서 값이 false인 것만 개수 구하기
                 answer++;
            }
        }

        return answer;
    }
}
