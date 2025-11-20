// https://school.programmers.co.kr/learn/courses/30/lessons/132267
// 콜라를 받기 위해 마트에 주어야 하는 병 수 a, 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b, 상빈이가 가지고 있는 빈 병의 개수 n이 매개변수로 주어집니다. 상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.
// 제한사항
// 1 ≤ b < a ≤ n ≤ 1,000,000
// 정답은 항상 int 범위를 넘지 않게 주어집니다.

public class 콜라_문제 {
    static void main() {
        Cola cola = new Cola();
        System.out.println(cola.solution(2, 1, 20));
    }
}

class Cola {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remainder = 0;
        while (n >= a || remainder == 0) {
            int returned = (n / a) * b;
            remainder = n % a;
            n = returned + remainder;
            if (n == 0) break;
            answer += returned;
        }
        return answer;
    }
}