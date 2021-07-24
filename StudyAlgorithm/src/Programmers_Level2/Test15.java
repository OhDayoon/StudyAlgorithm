package Programmers_Level2;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(int [][]board){
        int answer=0;
        int[][] arr=new int[board.length+1][board[0].length+1];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                arr[i+1][j+1]=board[i][j];
            }
        }
        
        int max=0;
       
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    int left=arr[i-1][j]; //좌
                    int up=arr[i][j-1]; // 상
                    int leftup=arr[i-1][j-1]; // 좌상
                    int min=Math.min(left,Math.min(up,leftup));
                    arr[i][j]=min+1;
                    max=Math.max(max,min+1);
                }
            }
        }
        answer=max*max;
        return answer;
    }
}
