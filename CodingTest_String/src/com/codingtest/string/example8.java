package com.codingtest.string;

import java.util.Scanner;

class example8 {	
	public String solution(String s){
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]", ""); //알파벳 A부터 Z까지가 아니면(^)
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) { //abcdbca 가 거꾸로 읽으나 똑바로 읽으나 같은것, 팰린드롬이라고함
			answer="YES";
		}
		return answer;
	}

	public static void main(String[] args){
		example8 T = new example8();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}