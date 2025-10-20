import java.time.LocalDate;
import java.util.Scanner;

class Solution {
    int solution(int age) {
        LocalDate today = LocalDate.now();
        int birth_year = today.getYear() - (age - 1);
        return birth_year;
    }
}

public class 나이_출력 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("현재 나이를 입력하세요: ");
        int age = scanner.nextInt();

        Solution solution = new Solution();
        int birth_year = solution.solution(age);
        System.out.println("출생 년도 : " + birth_year);
    }
}
