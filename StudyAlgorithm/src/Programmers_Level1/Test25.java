package Programmers_Level1;

import java.util.Arrays;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums); // 전에 있는 값과 현재 값이 동일한지 알아보기 위해 정렬을 해야한다.
        
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){ // 값이 다르다면
                cnt++; // 증가
            }
        }
        int n=nums.length/2;
        
        if(n<cnt){
            answer=n;
        }
        else{
            answer=cnt;
        }
        return answer;
        
        /*
         * int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);
        
		// nums[] 배열의 중복제거
		for(int i=1; i<nums.length; i++) 
			if(!list.contains(nums[i]))
				list.add(nums[i]);
        
		 list.size(): 포켓몬의 종류, nums.length: 가질 수 있는 포켓몬의 수
		answer = (list.size() < nums.length/2) ? list.size() : nums.length/2;
		return answer;
         */
    }
}
