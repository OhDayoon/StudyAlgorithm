package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test12904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer s=new StringBuffer(br.readLine());
		StringBuffer t=new StringBuffer(br.readLine());
		
		while(s.length()<t.length()) {
			if(t.charAt(t.length()-1)=='A') {
				t.deleteCharAt(t.length()-1);
			}
			else if(t.charAt(t.length()-1)=='B') {
				t.deleteCharAt(t.length()-1); // 이 방법대신  subString으로도 표현할 수 있다
				t.reverse(); // 문자열 뒤집기
			}
		}
		
		if(s.toString().equals(t.toString())) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
