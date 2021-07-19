package Programmers;

public class Test20 {

	public static void main(String[] args) {
		
	}
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0;i<a.length;i++){ // a와 b의 배열 길이는 동일
            answer+=a[i]*b[i]; // 동일한 i번째를 곱해준다.
        }
        return answer;
    }
}
