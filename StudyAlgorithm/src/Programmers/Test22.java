package Programmers;

import java.util.ArrayList;

public class Test22 {
	// 모의고사
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] solution(int[] answers) { // 세명의 수포자 존재
        int[] answer = {};
        int[] p1={1,2,3,4,5}; // 1번 수포자가 찍는 순서
        int[] p2={2,1,2,3,2,4,2,5}; // 2번 수포자가 찍는 순서
        int[] p3={3,3,1,1,2,2,4,4,5,5}; // 3번 수포자가 찍는 순서
        
        int a1=0,a2=0,a3=0;
        
        for(int i=0;i<answers.length;i++){
            if(answers[i]==p1[i%p1.length]) a1++; // 정답과 1번 수포자가 찍은 답이 일치하면 점수 증가
            if(answers[i]==p2[i%p2.length]) a2++; // 정답과 2번 수포자가 찍은 답이 일치하면 점수 증가
            if(answers[i]==p3[i%p3.length]) a3++; // 정답과 3번 수포자가 찍은 답이 일치하면 점수 증가
        }
        int max=Math.max(Math.max(a1,a2),a3); // 최고점 찾기
        ArrayList<Integer> list=new ArrayList<Integer>(); // 점수가 높은 수포자 찾아 배열에 담기
        if(max==a1) list.add(1);
        if(max==a2) list.add(2);
        if(max==a3) list.add(3);
        
        answer=new int[list.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}
