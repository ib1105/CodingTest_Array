package com.codingtest.string;

import java.util.*;
class example6 {	
	public String solution(String str){
		String answer="";
		for(int i=0; i<str.length(); i++){
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));//  indexOf 는 문자열안에 조건이 되는 문자열이 최초 몇 번째 위치에 존재하는지를 확인하는 함수
			if(str.indexOf(str.charAt(i))==i) {
				answer+=str.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args){
		example6 T = new example6();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}