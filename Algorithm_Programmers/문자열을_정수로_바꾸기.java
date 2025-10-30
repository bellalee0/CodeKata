// https://school.programmers.co.kr/learn/courses/30/lessons/12925
// 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
// 제한 조건
// s의 길이는 1 이상 5이하입니다.
// s의 맨앞에는 부호(+, -)가 올 수 있습니다.
// s는 부호와 숫자로만 이루어져있습니다.
// s는 "0"으로 시작하지 않습니다.

import java.util.Scanner;

public class 문자열을_정수로_바꾸기 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        ChangeStringToInt changeStringToInt = new ChangeStringToInt();
        System.out.println(changeStringToInt.solution(s));
    }
}

class ChangeStringToInt {
    public int solution(String s) {
        return Integer.parseInt(s); // 원시데이터인 int 타입으로 반환
    }

    public int solution2(String s) {
        return Integer.valueOf(s); // Integer 래퍼 객체를 반환
    }
}