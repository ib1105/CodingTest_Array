package com.codingtest.string;

import java.util.Scanner;

class example5 {	
	public String solution(String str){
		String answer;
		char[] s=str.toCharArray();
		int lt=0, rt=str.length()-1; //lt는 보통 가장 왼쪽글자, rt는 가장 오른쪽 글자로 통한다.
		while(lt<rt){
			if(!Character.isAlphabetic(s[lt])) {//lt가 특수문자면 +1
				lt++;
			}
			else if(!Character.isAlphabetic(s[rt])) {//rt가 특수문자면 -1
				rt--;
			}
			else{ //둘다 알파벳이면
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer=String.valueOf(s);
		return answer;
	}

	public static void main(String[] args){
		example5 T = new example5();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}