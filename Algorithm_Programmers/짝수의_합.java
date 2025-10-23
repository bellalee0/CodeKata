import java.util.Scanner;

public class 짝수의_합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 1: ");
        int num1 = scanner.nextInt();

        Sum_Even sumEven = new Sum_Even();
        System.out.println(sumEven.solution(num1));
    }
}

class Sum_Even {
    public int solution(int n) {
        int answer = 0;
        if (n > 0 && n <= 1000) {
            for (int i=2; i <= n; i+=2) {
                answer += i;
            }
        }
        return answer;
    }
}