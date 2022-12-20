package com.codingtest.string;

import java.util.Scanner;

class example7 {	
	public String solution(String str){
		String answer="YES";
		str=str.toUpperCase();
		int len=str.length();
		for(int i=0; i<len/2; i++){ //2로 나눈 몫의 전까지 돌리면 된다. ex) 5/2 = 2.5 -> 즉, 0에서 2까지 반복한다.
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
		}
		return answer;
	}

	public static void main(String[] args){
		example7 T = new example7();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}

/*
class Main {	
	public String solution(String str){
		String answer="NO";
		String tmp=new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}*/
