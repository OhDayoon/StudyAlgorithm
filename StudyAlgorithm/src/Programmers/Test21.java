package Programmers;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int solution(int n, int[] lost, int[] reserve) {
	        int answer = n-lost.length;
	       
	        // 여벌옷을 가져온 사람이 도난을 당한 경우
	        for(int i=0;i<lost.length;i++){
	            for(int j=0;j<reserve.length;j++){
	                if(lost[i]==reserve[j]){
	                    answer++;
	                    lost[i]=-1; // 존재할 수 없는 값인 -1을 인덱스로 설정
	                    reserve[j]=-1;
	                    break;
	                }
	            }
	        }
	        
	        // 여벌옷을 빌릴 수 있는 경우
	        for(int i=0;i<lost.length;i++){
	            for(int j=0;j<reserve.length;j++){
	                if(lost[i]-1==reserve[j]||lost[i]+1==reserve[j]){
	                    answer++;
	                    reserve[j]=-1;
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
}
