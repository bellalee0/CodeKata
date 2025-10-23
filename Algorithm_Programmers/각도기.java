import java.util.Scanner;

public class 각도기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("예각(0~90): 1 / 직각(90): 2 / 둔각(90~180): 3 / 평각(180): 4 / 그 외: 0으로 출력됩니다.");
        System.out.print("각도를 입력해주세요: ");
        int angle = scanner.nextInt();

        Protractor protractor = new Protractor();
        System.out.println(protractor.solution(angle));
    }
}

class Protractor {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle <= 180) {
            if (angle > 0 && angle < 90) return 1;
            else if (angle == 90) return 2;
            else if (angle > 90 && angle < 180) return 3;
            else if (angle == 180) return 4;
        }
        return answer;
    }
}