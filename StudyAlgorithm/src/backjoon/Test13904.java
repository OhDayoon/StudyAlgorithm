package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test13904 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[][] dw=new int[n][2];
		
		for(int i=0;i<n;i++) {
			dw[i][0]=sc.nextInt(); // 제출 마감기한
			dw[i][1]=sc.nextInt(); // 점수
		}
		
		// 과제 점수 내림차순
		Arrays.sort(dw,new Comparator<int[]>() {
			@Override
			public int compare(int[] a1,int[] a2) {
				return Integer.compare(a2[1], a1[1]);
			}
		});
		
		int[] score=new int[1001]; // 마감기한에 맞도록 최대점수가 채워지는 배열이다.
		
		// 60+50+40+30+5 의 순서로 score 배열에 들어간다.
		for(int i=0;i<n;i++) {
			for(int j=dw[i][0];j>0;j--) { // 제출 기한
				if(score[j]==0) { // score의 배열이 비어있다면
					score[j]=dw[i][1]; // 최대 점수가 score 배열에 들어간다.
					break;// 빠져 나와서 for 문 i를 반복함
				}
			}
		}
		
		int mscore=0;
		for(int i=0;i<score.length;i++) {
			mscore+=score[i];
		}
		System.out.println(mscore);
		sc.close();
	}

}
