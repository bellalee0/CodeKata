// https://school.programmers.co.kr/learn/courses/30/lessons/77884
// 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
// 제한사항
// 1 ≤ left ≤ right ≤ 1,000

import java.util.stream.IntStream;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        int left = 12, right = 15;

        Divisor divisor = new Divisor();
        System.out.println(divisor.solution(left,right));
    }
}

class Divisor {
    public int solution(int left, int right) {
        int answer = 0;
        int[] array = IntStream.rangeClosed(left, right).toArray();
        for (int n : array) {
            if (IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count() % 2 == 0) {
                answer += n;
            } else {
                answer -= n;
            }
        }
        return answer;
    }

    public int solution2(int left, int right) {
        int answer = 0;
        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }
        return answer;
    }
}