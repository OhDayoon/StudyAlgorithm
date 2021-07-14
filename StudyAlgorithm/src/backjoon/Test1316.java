package backjoon;

import java.util.Scanner;

public class Test1316 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String[] word=new String[n];
		for(int i=0;i<n;i++) {
			word[i]=sc.next();
		}
		
		
		int sum=n;
		for(int i=0;i<n;i++) {
			boolean[] alpha=new boolean[26]; // true false로 판단. 디폴트값은 false
			for(int j=1;j<word[i].length();j++) {
				if(word[i].charAt(j-1)!=word[i].charAt(j)) { // 앞에 나온 문자와 현재 문자가 동일하지 않다면
					if(alpha[word[i].charAt(j)-97]==true) { // alpha 배열이 true 일때 그룹단어가 아니기 때문에
						sum--; // 개수 차감
						break; // if문 빠져나감
					}
					alpha[word[i].charAt(j-1)-97]=true;
				
				}
			}
		
		}
		System.out.println(sum);
		sc.close();
	}
}
