package Programmers_Level1;

public class Test24 {
	// 키패드 누르기
	public static void main(String[] args) {
		

	}
	public String solution(int[] numbers, String hand) {
        String answer = "";
        
        // 키패드에는 숫자 1~9, *,0,#이 존재한다.
        // 처음 *은 왼쪽에 위치, #은 오른쪽에 위치하므로 숫자로 바꿔준다.
        int left=10, right=12; 
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0) numbers[i]=11; // 0을 누르면 11로 값 변경
            
            if(numbers[i]==1 || numbers[i]==4||numbers[i]==7){ // 1,4,7은 무조건 왼쪽손가락
                answer+="L";
                left=numbers[i];
            }
            else if(numbers[i]==3 || numbers[i]==6||numbers[i]==9){ // 3,6,9는 무조건 오른쪽 손가락
                answer+="R";
                right=numbers[i];
            }
            else{
                int minL=Math.abs(left-numbers[i]);
                int minR=Math.abs(right-numbers[i]);
                int disL=minL/3+(minL%3); // 왼손으로 눌렀을 때 거리
                int disR=minR/3+(minR%3); // 오른손으로 눌렀을 때 거리
                
                if(disL<disR){
                    answer+="L";
                    left=numbers[i];
                }
                else if(disL>disR){
                    answer+="R";
                    right=numbers[i];
                }
                else{
                    if(hand.equals("left")){
                        left=numbers[i];
                        answer+="L";
                    }
                    else{
                        right=numbers[i];
                        answer+="R";
                    }
                }
            }
            
        }
        
        return answer;
    }
}
