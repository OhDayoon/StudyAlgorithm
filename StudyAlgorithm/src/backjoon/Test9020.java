package backjoon;

import java.util.Scanner;

public class Test9020 {

	public static boolean[] prime=new boolean[10001];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		getPrime();// 소수 알아내기
		
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int first=n/2; // 두 소수의 차이를 작게 하기 위해 2로 나누기
			int second=n/2;
			
			while(true) {
				if(!prime[first]&&!prime[second]) { // 두 값을 소수로 나타내기 위해
					System.out.println(first+" "+second);
					break;
				}
				first--; 
				second++;
			}
		}
		sc.close();
	}
	
	public static void getPrime() {
		prime[0]=prime[1]=true; //0과 1은 소수가 될 수 없다.
		
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) continue;
			for(int j=i*i;j<prime.length;j+=i) { // 배수는 소수가 될 수 없으니 불린값을 true로 변경
				prime[j]=true; // 
			}
		}
	}

}
