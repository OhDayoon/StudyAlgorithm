package Programmers_Level2;

import java.util.HashMap;

public class Test13 {
	// 전화번호목록(해시)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        /* 효율성문제
	        for(int i=0;i<phone_book.length-1;i++){
	            for(int j=i+1;j<phone_book.length;j++){
	                
	                /*1. 효율성 오류
	                if(phone_book[i].length()<phone_book[j].length()){
	                    if(phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))){
	                        answer=false;
	                        break;
	                    }
	                }
	                else{
	                    if(phone_book[j].equals(phone_book[i].substring(0,phone_book[j].length()))){
	                        answer=false;
	                        break;
	                    }
	                }
	                */
	        
	                /* 2. 효율성 오류
	                if(phone_book[i].startsWith(phone_book[j])) return false;
	                if(phone_book[j].startsWith(phone_book[i])) return false;
	                }
	          }
              */
	        // 해시를 이용해서 문제 풀기
            HashMap<String,Integer> map=new HashMap<>(); // key, value 해시
            for(int i=0;i<phone_book.length;i++){
                map.put(phone_book[i],i);
            }
    
            for(int i=0;i<phone_book.length;i++){
                for(int j=1;j<phone_book[i].length();j++){
                    if(map.containsKey(phone_book[i].substring(0,j))){ // 맵에 포함되었다면
                        return false;
                    }
                }
            }
	        return answer;
	    }
}
