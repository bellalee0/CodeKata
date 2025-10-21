// https://school.programmers.co.kr/learn/courses/30/lessons/120807
// 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
// 제한사항
// 0 ≤ num1 ≤ 10,000
// 0 ≤ num2 ≤ 10,000

import java.util.Scanner;

class Compare {
    public int compare(int num1, int num2) {
        int answer = 0;
        if (num1 >= 0 && num1 <= 10000 && num2 >= 0 && num2 <= 10000 ) {
            if (num1 == num2) {
                answer = 1;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}

public class 숫자_비교하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 1: ");
        int num1 = scanner.nextInt();
        System.out.print("숫자 2: ");
        int num2 = scanner.nextInt();

        Compare compare = new Compare();
        int answer = compare.compare(num1, num2);
        System.out.println(answer);
    }
}
