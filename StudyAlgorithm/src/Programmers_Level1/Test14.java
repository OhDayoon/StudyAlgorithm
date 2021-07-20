package Programmers_Level1;

public class Test14 {
	// 2016년
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(int a, int b) {
        String answer = "";
        int[] month={31,29,31,30,31,30,31,31,30,31,30,31}; // 1월~12월까지의 일수
        String[] day={"SUN","MON","TUE","WED","THU","FRI","SAT"}; // 일요일~월요일
        
        int date=0;
        
        for(int i=0;i<a-1;i++){ // 알고싶은 월의 전월까지
            date+=month[i]; // 일수를 모두 더함
        }
        date+=(b-1);
        answer=day[(date+5)%7]; // 1월 1일이 금요일이므로 5를 더한다, 금요일은 배열에서 5번째 위치
        return answer;
    }
}
