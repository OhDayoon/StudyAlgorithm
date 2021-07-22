package backjoon;

import java.util.*;

public class Test10773 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<k;i++) {
			int n=sc.nextInt();
			
			if(n!=0) {
				st.push(n);
			}
			else { // 0을 입력할 때 스택값 지우기
				st.pop();
			}
		}
		int sum=0;
		if(st.isEmpty()) { // 스택이 비어있다면
			System.out.println(0); 
		}
		else {
			for(int i=0;i<st.size();i++) { // 스택 사이즈만큼 반복
				sum+=st.get(i); // 스택의 인덱스마다 더해준다
			}
			System.out.println(sum);
		}
		sc.close();

	}

}
