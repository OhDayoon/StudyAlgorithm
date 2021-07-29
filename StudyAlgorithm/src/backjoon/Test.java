package backjoon;

import java.util.Scanner;

public class Test {


	public static void main(String[] args) {
		
		Test stack=new Test();
		int[] arr= {7, 3, 2, 9, 4};
		int temp=0;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	    }
}
