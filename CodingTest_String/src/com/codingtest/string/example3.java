package com.codingtest.string;

import java.util.*;
class example3 {	
	public String solution(String str){
		
		String answer="";
		int m=Integer.MIN_VALUE; //가장작은 값으로 초기화됨
		String[] s = str.split(" "); //띄어쓰기로 분리하여 배열에 저장
		
		for(String x : s){
			int len=x.length();
			if(len>m){
				m=len;
				answer=x;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		example3 T = new example3();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine(); //단어가 아니라 줄을 입력해야하므로 nextLine();
		System.out.print(T.solution(str));
	}
}


