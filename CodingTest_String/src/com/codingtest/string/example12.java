import java.util.*;
class example12 {
    public String solution(int n, String s){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=s.substring(0, 7).replace('#', '1').replace('*', '0');//.substring(0,7) 0~7번째까지 잘라라, replace('#','1') #을 1로 바꾸어라
            int num=Integer.parseInt(tmp, 2);//parseInt(tmp, 2) 이 형식은 tmp 형식을 2진수로 계산하여 10진수로 바꾸는 것이다.
            answer+=(char)num;//(char): 강제형변환 숫자를 문자로 형 변환
            s=s.substring(7);//substring(7) 앞자리부터 7번째자리까지 잘라라
        }
        return answer;
    }

    public static void main(String[] args){
        example12 T = new example12();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(); //int 형을 엔터쳤을때
        String str=kb.next();
        System.out.println(T.solution(n, str));
    }
}