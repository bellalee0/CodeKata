// https://school.programmers.co.kr/learn/courses/30/lessons/136798
// 기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때, 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.
// 제한사항
// 1 ≤ number ≤ 100,000
// 2 ≤ limit ≤ 100
// 1 ≤ power ≤ limit

import java.util.Arrays;
import java.util.stream.IntStream;

public class 기사단원의_무기 {
    public static void main(String[] args) {
        KnightsWeapon knightsWeapon = new KnightsWeapon();
        knightsWeapon.solution2(5, 3, 2);
    }
}

class KnightsWeapon {
    public int solution(int number, int limit, int power) {

        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            answer += count <= limit ? count : power;
        }

        return answer;
    }

    public int solution2(int number, int limit, int power) {

        int answer = 1;

        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= (int) Math.sqrt(i); j++){
                if (i % j == 0) {
                    count += 2;
                }
                if (j * j == i) {
                    count -= 1;
                }
            }
            answer += count <= limit ? count : power;
        }

        return answer;
    }
}