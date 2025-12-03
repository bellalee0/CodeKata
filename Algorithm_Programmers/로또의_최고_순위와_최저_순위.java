// https://school.programmers.co.kr/learn/courses/30/lessons/77484
// 민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 이때, 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        FirstPrizeLowestPrize firstPrizeLowestPrize = new FirstPrizeLowestPrize();
        firstPrizeLowestPrize.solution(lottos, win_nums);
    }
}

class FirstPrizeLowestPrize {
    public int[] solution(int[] lottos, int[] win_nums) {

        int count = 0;
        int zero = 0;
        for (int num : lottos) {
            for (int win : win_nums) {
                if (num == win) { count++; }
            }
            if (num == 0) { zero++; }
        }

        int maxCount = count + zero <= 6 ? count + zero : 6;
        int minCount = count;

        int[] prizes = {6, 6, 5, 4, 3, 2, 1};
        return new int[]{prizes[maxCount], prizes[minCount]};
    }
}