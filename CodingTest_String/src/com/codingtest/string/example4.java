package com.codingtest.string;

import java.util.*;
class example4 {	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			String tmp=new StringBuilder(x).reverse().toString();//StringBuilder : 문자열을 다루는 클래스
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args){
		example4 T = new example4();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String[] str=new String[n];
		for(int i=0; i<n; i++){
			str[i]=kb.next();
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}