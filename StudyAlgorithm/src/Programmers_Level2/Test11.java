package Programmers_Level2;

import java.util.*;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] solution(int[] progresses, int[] speeds) {
        int[] arr=new int[progresses.length+1];
        for(int i=0;i<progresses.length;i++){
            int p=100-progresses[i];
                if((p%speeds[i])==0){ // 나머지가 없을 때
                    arr[i]=p/speeds[i];
                }
            else{ // 나머지가 있을 때
                arr[i]=(p/speeds[i])+1; // 하루 연장
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int k=0;k<progresses.length;k++){
            int cnt=1;
            if(arr[k]<0) continue; // 배열에서 0보다 작은 값이 있다면 건너뛰기
            for(int j=k+1;j<progresses.length;j++){
                if(arr[k]>=arr[j]){
                    arr[j]=-1;
                    cnt++;
                }
                else {
                    break;
                }
            }
            list.add(cnt); // 리스트 담기
        }
        int[] answer=new int[list.size()];
       for(int i=0;i<list.size();i++){
           answer[i]=list.get(i);
       }
        return answer;
    }
}
