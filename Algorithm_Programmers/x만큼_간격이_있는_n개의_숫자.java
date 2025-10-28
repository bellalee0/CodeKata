// https://school.programmers.co.kr/learn/courses/30/lessons/12954
// 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
// 제한 조건
// x는 -10000000 이상, 10000000 이하인 정수입니다.
// n은 1000 이하인 자연수입니다.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 x를 입력해주세요: ");
        int x = scanner.nextInt();
        System.out.print("자연수 n을 입력해주세요: ");
        int n = scanner.nextInt();

        Multiple multiple = new Multiple();
        System.out.println(Arrays.toString(multiple.solution(x,n)));
    }
}

class Multiple {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            answer[i-1] = (long)x * i;
        }
        return answer;
    }
}