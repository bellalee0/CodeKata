// https://school.programmers.co.kr/learn/courses/30/lessons/12933
// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
// 제한 조건
// n은 1이상 8000000000 이하인 자연수입니다.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        DescOrder descOrder = new DescOrder();
        System.out.println(descOrder.solution(n));
    }
}

class DescOrder {
    public long solution(long n) {
        String[] array = String.valueOf(n).split("");
        long result = 0;
        for (long l : Arrays.stream(array).map(Long::parseLong).sorted(Comparator.reverseOrder()).collect(Collectors.toList())) {
            result = result * 10 + l;
        }
        return result;
    }
}