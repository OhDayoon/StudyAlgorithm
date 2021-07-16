package Programmers;

import java.util.*;

public class Test13 {
	//두 개 뽑아서 더하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] solution(int[] numbers) {
	        
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        int len=numbers.length;
	        if(len>=2 && len<=100){// 배열의 길이가 2~10
	            for(int i=0;i<len-1;i++){
	                if(numbers[i]>=0 && numbers[i]<=100){
	                    for(int j=i+1;j<len;j++){
	                        int p=numbers[i]+numbers[j]; //반복문을 돌면서 두개의 수를 더한다.
	                        list.add(p); // 리스트에 담기
	                    }
	                }
	            }   
	        }
	        int[] arr = new int[list.size()];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=list.get(i); // 리스트를 배열로 전환
	        }
	        Arrays.sort(arr);// 오름차순
	        list=new ArrayList<Integer>();
	        list.add(arr[0]);
	        for(int i=1;i<arr.length;i++){
	            if(arr[i-1]!=arr[i]){ // 중복되는 수가 아니라면 새로운 배열에 담기
	                list.add(arr[i]);
	            }
	        }
	        int[] answer = new int[list.size()];
	        for(int i=0;i<list.size();i++){
	            answer[i]=list.get(i);
	        }
	        return answer;
	    }
}
