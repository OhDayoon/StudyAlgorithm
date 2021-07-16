package Programmers;

public class Test12 {
	// 다트게임
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(String dartResult) {
        int answer = 0;
        int[] point=new int[3];
        int idx=0;
        
        String str="";
        for(int i=0;i<dartResult.length();i++){
            char ch = dartResult.charAt(i); // 한글자씩 char타입으로 변환
            
            if(ch>='0'&&ch<='9'){ // 숫자라면
                str+=String.valueOf(ch); // 문자열로 변환
            }
            else if(ch=='S'||ch=='D'||ch=='T'){
                int p=Integer.parseInt(str); // 문자열로 변환한 것을 정수로 변환
                
                if(ch=='S'){ // 1제곱
                    p=(int)Math.pow(p,1);
                }
                else if(ch=='D'){ //2제곱
                    p=(int)Math.pow(p,2);
                }
                else if(ch=='T'){ //3제곱
                    p=(int)Math.pow(p,3);
                }
                point[idx++]=p; 
                str="";   
            }
            else{
                if(ch=='#'){
                    point[idx-1]*=(-1); // 배열의 전 단계에 -1로 곱함
                }
                else{
                    point[idx-1]*=2;
                    if(idx-2>=0){
                        point[idx-2]*=2;
                    }
                }
            }
            
            
        }
        
        for(int val:point){
            answer+=val;
        }
        return answer;
    }
}
