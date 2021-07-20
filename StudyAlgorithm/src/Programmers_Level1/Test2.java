package Programmers_Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
	
	// 나누어 떨어지는 숫자 배열
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int[] solution(int[] arr, int divisor) {

	        
	        ArrayList<Integer> list=new ArrayList();
	        
	        Arrays.sort(arr);
	        
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]%divisor==0){ // 나머지가 존재하지 않는 숫자만
	                list.add(arr[i]); // 리스트에 추가
	            }
	        }
	        
	        if(list.size()==0){ // 나누어 떨어지는 숫자가 존재하지 않으면 리스트에 추가 되지 않으므로 
	            list.add(-1);
	        }
	        
	        int[] answer = new int[list.size()];
	            
	        for(int i=0;i<list.size();i++){
	            answer[i]=list.get(i);   
	        }
	        
	        Arrays.sort(answer);
	        return answer;  
	        
	    }
}
