package Programmers_Level2;

public class Test3 {
	// 행렬의 곱셈
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[][] solution(int[][] arr1, int[][] arr2) {
		// 테스트 실행은 맞았지만 테스트 제출시 런타임에러 발생
		// 그 이유는 행렬의 크기는 앞쪽의 행* 뒤쪽의 열로 생성해야하는데 동일한 배열로 행렬을 만들어 에러 발생
		
        int[][] answer = new int[arr1.length][arr2[0].length]; 
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k=0;k<arr1[0].length;k++){
                     answer[i][j]+=arr1[i][k]*arr2[k][j];
                }
                    
                }
            
        }
        
        return answer;
    }
}
