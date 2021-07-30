package backjoon;

import java.io.*;
import java.util.*;

public class Test10825 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] student = new String[n][4];
        for (int i = 0; i < n; i++) {
        	student[i] = br.readLine().split(" ");
        }
		
		Arrays.sort(student,new Comparator<String[]>() {
			@Override
			public int compare(String[] s1,String[] s2) {
				if(Integer.parseInt(s1[1])==Integer.parseInt(s2[1])) {
					if(Integer.parseInt(s1[2])==Integer.parseInt(s2[2])) {
						if(Integer.parseInt(s1[3])==Integer.parseInt(s2[3])) {
							//국영수 같을 때 사전 오름차순
							return s1[0].compareTo(s2[0]);
						}
						// 국어, 영어 같을 때 수학 내림차순
						return Integer.compare(Integer.parseInt(s2[3]),Integer.parseInt(s1[3]));
					}
					// 국어 같을 때 영어 오름차순
					return Integer.compare(Integer.parseInt(s1[2]),Integer.parseInt(s2[2]));
				}
				// 국어 내림차순
				return Integer.compare(Integer.parseInt(s2[1]),Integer.parseInt(s1[1]));
			}
		});
		for(int i=0;i<n;i++) {
			System.out.println(student[i][0]);
		}
	}

}
