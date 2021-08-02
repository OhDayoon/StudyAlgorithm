package Programmers_Level2;

import java.util.*;

public class Test16 {
	// programmers-Level1 : 실패율 다시 할 것
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=5;
		int[] stages= {2, 1, 2, 6, 2, 4, 3, 3};
		double[] answer = new double[N+1];
        
        ArrayList<Integer> list=new ArrayList<>();
        
        double len=stages.length;
        for(int i=1;i<=N;i++){
            double cnt=0;
            for(int j=0;j<stages.length;j++){
                if(stages[j]==i){
                    cnt++;
                }
            }
            answer[i]=cnt/len;
            len-=cnt;
        }
        double max=-1;
        
        for(int i=1;i<answer.length;i++){
            for(int j=0;j<answer.length;j++){
                max=Math.max(max, answer[j]);
            }
            if(max==answer[i]){
                    list.add(i);
                    answer[i]=-1;
                    max=-1;
                }
        }
        
        for(int i=0;i<answer.length;i++) {
        	System.out.println(answer[i]);
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
            System.out.println(arr[i]);
        }


	}

}
