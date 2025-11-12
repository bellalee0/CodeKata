// https://school.programmers.co.kr/learn/courses/30/lessons/12940
// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
// 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
// 제한 사항
// 두 수는 1이상 1000000이하의 자연수입니다.

import java.util.Arrays;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        CommonDivisorCommonMultiple commonDivisorCommonMultiple = new CommonDivisorCommonMultiple();
        int[] calculate = commonDivisorCommonMultiple.solution(3, 12);
        System.out.println(Arrays.toString(calculate));
    }
}

class CommonDivisorCommonMultiple {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대공약수
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }
        // 최소공배수 : 두 수의 곱 / 최대공약수
        answer[1] = n * m / answer[0];
        return answer;
    }

    // 최대공약수에 재귀함수 사용
    public int[] solution2(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m /  answer[0];
    }

    public int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a%b);
    }
}