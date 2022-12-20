package com.codingtest.string;

import java.util.Scanner;

class example9 {	
	public int solution(String s){
		//int answer=0;
		String answer="";
		char a[] = s.toCharArray();
		for(char x : a){
			if(Character.isDigit(x)) {
				answer+=x;
			}
		}
		return Integer.parseInt(answer); //int형으로 변환
	}

	public static void main(String[] args){
		example9 T = new example9();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}
/*
class example9 {	
	public String solution(String s){
		String answer="NO";
		char[] a = s.toCharArray();
		String ans = "";
		for (char x : a) {
			if(!Character.isAlphabetic(x)) {
				ans = ans + x;
			}
		}
		if (ans.charAt(0) == 0) {
			answer = ans.split("0");
		}
		
		return answer;
	}

	public static void main(String[] args){
		example9 T = new example9();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}*/
