package Programmers_Level2;

public class Test1 {
	// 최소공배수 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[] arr) {
        int answer=arr[0];
        
        for(int i=0;i<arr.length;i++){
            answer=lcm(answer,arr[i]);
        }
        return answer;
    }
	// 최대공약수 구하는 메소드
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    // 최소공배수 구하는 메소드
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
