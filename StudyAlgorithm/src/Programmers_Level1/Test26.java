package Programmers_Level1;

import java.util.Stack;

public class Test26 {
	// 크레인 인형뽑기
	// 위에서 인형을 뽑고 맨 아래는 막혀있기때문에 스택 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> st= new Stack<Integer>();
        
        for(int i=0;i<moves.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1]!=0){// 인형이 존재할 때
                    if(st.isEmpty()){// 스택이 비어있으면
                        st.push(board[j][moves[i]-1]); // 스택에 쌓기
                    }
                    else{ // 스택이 비어있지 않다면
                        if(st.peek()==board[j][moves[i]-1]){ // 현재 스택 위에 있는 값과 인형뽑기 한 값이 일치한다면
                            st.pop();// 동일한 값 없애기
                            answer+=2; // 사라진 인형 수 증가
                        }
                        else{
                            st.push(board[j][moves[i]-1]); // 스택에 쌓기
                        }
                    }
                    board[j][moves[i]-1]=0; // 스택으로 옮겨간 인형은 사라져야 하므로 0으로 값 변경
                    break;
                }
            }
        }
        return answer;
    }
}
