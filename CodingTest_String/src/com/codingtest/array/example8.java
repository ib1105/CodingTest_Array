package com.codingtest.array;

import java.util.*;
class example8 {
    public int[] solution(int n, int[] arr){
        /*int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
        }
        return answer;*/

        int[] answer = new int[5];
        for(int i=0;i<arr.length; i++){
            int cnt = 1;
            for(int j=0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;

    }
    public static void main(String[] args){
        example8 T = new example8();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x :T.solution(n, arr)) System.out.print(x+" ");
    }
}