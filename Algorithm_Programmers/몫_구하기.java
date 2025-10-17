// https://school.programmers.co.kr/learn/courses/30/lessons/120805
// 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
// 제한사항
// 0 ≤ num1 ≤ 100
// 0 ≤ num2 ≤ 100

import java.util.Scanner;

public class 몫_구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 1: ");
        int num1 = scanner.nextInt();
        System.out.print("숫자 2: ");
        int num2 = scanner.nextInt();

        Div div = new Div();
        int answer = div.solution(num1, num2);
        System.out.println(answer);
    }
}

class Div {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
            answer = num1 / num2;
        }
        return answer;
    }
}