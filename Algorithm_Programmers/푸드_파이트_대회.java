// https://school.programmers.co.kr/learn/courses/30/lessons/134240
// 수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때, 대회를 위한 음식의 배치를 나타내는 문자열을 return 하는 solution 함수를 완성해주세요.
// 제한사항
// 2 ≤ food의 길이 ≤ 9
// 1 ≤ food의 각 원소 ≤ 1,000
// food에는 칼로리가 적은 순서대로 음식의 양이 담겨 있습니다.
// food[i]는 i번 음식의 수입니다.
// food[0]은 수웅이가 준비한 물의 양이며, 항상 1입니다.
// 정답의 길이가 3 이상인 경우만 입력으로 주어집니다.

public class 푸드_파이트_대회 {
    static void main() {
        int[] food = {1, 3, 4, 6};

        FoodFight foodFight = new FoodFight();
        System.out.println(foodFight.solution(food));
    }
}

class FoodFight {
    public String solution(int[] food) {
        String answer1 = "";
        String answer2 = "";
        for (int i = 1; i < food.length; i++) {
            int num = food[i] / 2;
            for (int j = 1; j <= num; j++) {
                answer1 = answer1 + i;
                answer2 = i + answer2;
            }
        }
        return answer1 + "0" + answer2;
    }

    public String solution2(int[] food) {
        String answer = "0";
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }
        return answer;
    }
}