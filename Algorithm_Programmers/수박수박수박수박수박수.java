// https://school.programmers.co.kr/learn/courses/30/lessons/12922
// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
// 제한 조건
// n은 길이 10,000이하인 자연수입니다.

import java.util.Scanner;

public class 수박수박수박수박수박수 {
    public static  void main(String args[])
    {
        int n = 12;

        Watermelon watermelon = new Watermelon();
        System.out.println(watermelon.solution2(n));
    }
}

class Watermelon {
    public String solution(int n) {
        String word = "수박";
        String s = "수";
        if (n % 2 == 0) {
            return word.repeat(n / 2);
        } else {
            return word.repeat(n / 2) + s;
        }
    }

    public String solution2(int n){
        return new String(new char[n/2+1]).replace("\0", "수박").substring(0,n);
    }

    public String solution3(int n){
        String result = "";
        for(int i=0;i<n;i++) {
            result +=(i%2==0)? "수":"박";
        }
        return result;
    }
}