package backjoon;
import java.util.*;

public class Test9012 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			String s=sc.next();
			System.out.println(solution(s));
		}
		
		sc.close();
	}

	public static String solution(String s) {
		
		String answer="";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				st.push('(');
			}
			else {
				if(st.isEmpty()) {
					return "NO";
				}
				else {
					st.pop();
				}
			}
		}
		if(st.isEmpty()) {
			answer="YES";
		}
		else {
			answer="NO";
		}
		return answer;
	}
	

}
