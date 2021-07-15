package backjoon;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        
	        int num=sc.nextInt();
	        int answer=0;
	        
	        while(num!=1 || answer>500){
	            if(num%2==0){
	                num=num/2;
	            }
	            else{
	                num=(num*3)+1;
	            }
	            answer++;
	        }
	        
	        if(answer>500){
	            answer=-1;
	        }
	       System.out.println(answer);
	    }
}
