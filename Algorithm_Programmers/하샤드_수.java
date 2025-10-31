// https://school.programmers.co.kr/learn/courses/30/lessons/12947
// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
// 제한 조건
// x는 1 이상, 10000 이하인 정수입니다.

import java.util.Scanner;

public class 하샤드_수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HarshadNumber harshadNumber = new HarshadNumber();
        System.out.println(n + ": " + harshadNumber.stream(n));
    }
}

class HarshadNumber {
    public boolean solution(int x) {
        String[] array = String.valueOf(x).split("");
        int sum = 0;
        for (String s : array) {
            sum += Integer.parseInt(s);
        }
        if (x % sum == 0) { return true; }
        else return false;
    }

    public boolean stream(int x) {
        int sum = String.valueOf(x).chars()  // chars() : String 객체에서 문자열을 구성하는 문자를 IntStream으로 변환(아스키코드)
                .map(ch -> ch - '0')  //  아스키코드로 저장된 숫자에서 문자 '0'을 빼서 정수 값 반환
                .sum();
        return x % sum == 0;
    }
}