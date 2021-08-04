package Programmers_Level1;

public class Test29 {
	// 비밀지도
	public static void main(String[] args) {
	
	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] sol=new String[n];
        
        for(int i=0;i<n;i++){
            String str="";
            String a=Integer.toBinaryString(arr1[i]).toString(); // 이진수로 변환
            String b=Integer.toBinaryString(arr2[i]).toString(); // 이진수로 변환
            while(a.length()<n){
                a="0"+a; // 변환한 길이가 n과 같아질 때 까지 앞에 0을 붙인다.
            }
            while(b.length()<n){
                b="0"+b; // 변환한 길이가 n과 같아질 때 까지 앞에 0을 붙인다.
            }
            for(int j=0;j<n;j++){
                if(a.charAt(j)=='1' || b.charAt(j)=='1'){ // a또는 b가 1인경우
                    str+="1"; // 문자열 1 붙이기
                }
                else{
                    str+="0"; // 아니라면 0붙이기
                }
            }
            answer[i]=str; // 배열에 str 담기
        }
        
        for(int i=0;i<n;i++){
            String str2="";
            for(int j=0;j<answer[i].length();j++){
                if(answer[i].charAt(j)=='1'){ // 문자열이 1일 때
                str2+="#"; // #으로 변환
                }
                else{
                    str2+=" "; // 0일 때 공백
                }
            }
            sol[i]=str2;
        }
        return sol;
        
        /* 다음과 같이 짧게 코드를 작성할 수 있다..
         String[] answer = new String[n]; 
         for(int i = 0; i < n; i++){ 
         answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); 
         			//비트연산 : 7 | 2 이면 00111 | 00001 일 때 하나라도 1이면 1, 아니면 0 
         } 
         
         for(int i = 0; i < n; i++){ 
         	answer[i] = String.format("%"+n+"s", answer[i]); 
         	//n개의 자릿수만큼 문자열 담기 
         	answer[i] = answer[i].replace("1", "#"); //answer[i]가 1이면 #으로 대체 
         	answer[i] = answer[i].replace("0", " "); //answer[i]가 0이면 " "으로 대체 
     	  } 
         	
         	return answer;

        */
    }
}
