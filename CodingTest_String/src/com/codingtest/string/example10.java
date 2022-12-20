package com.codingtest.string;

import java.util.*;
class example10 {	
	public int[] solution(String s, char t){
		int[] answer=new int[s.length()];
		int p=1000;
		for(int i=0; i<s.length(); i++){ //왼쪽에 있는 e로부터 거리
			if(s.charAt(i)==t){
				p=0;
				answer[i]=p;
			}
			else{
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=s.length()-1; i>=0; i--){ //오른쪽에 있는 e로부터 거리
			if(s.charAt(i)==t) p=0;
			else{
				p++;
				answer[i]=Math.min(answer[i], p); //최소값, answer[i]와 p 중 최솟값 구함
			}
		}
		return answer;
	}

	public static void main(String[] args){
		example10 T = new example10();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		char c=kb.next().charAt(0);
		for(int x : T.solution(str, c)){
			System.out.print(x+" ");
		}
	}
}