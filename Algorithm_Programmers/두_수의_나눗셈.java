import java.util.Scanner;

public class 두_수의_나눗셈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 1: ");
        int num1 = scanner.nextInt();
        System.out.print("숫자 2: ");
        int num2 = scanner.nextInt();

        Divide divide = new Divide();
        System.out.println(divide.solution(num1, num2));
    }
}

class Divide {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
            double d_num1 = num1;
            double d_num2 = num2;
            double d_answer = (d_num1 / d_num2) * 1000;
            answer = (int) d_answer;
        }
        return answer;
    }
}