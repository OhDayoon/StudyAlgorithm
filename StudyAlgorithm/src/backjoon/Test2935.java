package backjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Test2935 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// BigInteger: 거대무한정수
		// a와 b는 모두 10의 제곱형태라는 것을 보고 BigInteger을 사용해야함
		BigInteger a=new BigInteger(sc.next());
		String str=sc.next();
		BigInteger b=new BigInteger(sc.next());
	
		sc.close();
		switch (str) {
		case "*":
			System.out.println(a.multiply(b));
			break;
		case "+":
			System.out.println(a.add(b));
			break;
		default:
			break;
		}		
	}
}
