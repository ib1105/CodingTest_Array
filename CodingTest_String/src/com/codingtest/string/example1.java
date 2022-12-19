package com.codingtest.string;

import java.util.Scanner;

class example1{	
	public int solution(String str, char t){
		int answer=0;
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		//System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
		for(char x : str.toCharArray()){ //foreach에서 들어갈 파라미터는 배열 or 컬렉션이다. 그래서 string를 문자배열로 만들어야한다.
			if(x==t) answer++;
		}
		
		return answer;
	}

	public static void main(String[] args){  
		example1 T = new example1();
		Scanner kb = new Scanner(System.in);
		String str=kb.next(); //next() : console 창에서 문자열을 하나 읽어들임
		char c=kb.next().charAt(0); //next() : console 창에서 문자열을 하나 읽어들임, charAt(0) : 문자 하나를 console 창에서 읽어들임
		System.out.print(T.solution(str, c));
	}
}