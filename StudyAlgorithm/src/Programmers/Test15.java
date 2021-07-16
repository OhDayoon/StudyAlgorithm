package Programmers;

public class Test15 {
	// 약수의 개수와 덧셈
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int left, int right) {
        int answer = 0;
        
        int cnt=0,idx=0;

        int[] arr=new int[right-left+1];
        for(int i=left;i<=right;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){ // 약수 찾기
                    arr[idx]=i;
                    cnt++; // 개수 증가
                }
            }
            if(cnt%2==0){
                answer+=arr[idx];
            }
            else{
                answer-=arr[idx];
            }
            idx++;
            cnt=0; // 다음 약수를 찾기 위해서 개수 0으로 초기화
        }
        return answer;
    }
}
