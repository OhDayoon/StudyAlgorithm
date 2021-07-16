package Programmers;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s =sc.nextLine();
		System.out.println(solution(s));
	}
	public static int solution(String s) {
	  
	        
	    String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
	        
        for(int i=0;i<arr.length;i++){
            s=s.replaceAll(arr[i],Integer.toString(i)); // 배열에 맞는 영문이 나오면 교체한다.
                                                        // Integer.toString은 정수를 문자열로 변환
        }
        return Integer.parseInt(s);
    }
}
