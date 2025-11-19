// https://school.programmers.co.kr/learn/courses/30/lessons/42748
// 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
// 제한사항
// array의 길이는 1 이상 100 이하입니다.
// array의 각 원소는 1 이상 100 이하입니다.
// commands의 길이는 1 이상 50 이하입니다.
// commands의 각 원소는 길이가 3입니다.

import java.util.Arrays;

public class K번째_수 {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        KthNumber kthNumber = new KthNumber();
        kthNumber.solution(array, commands);
    }
}

class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int c = 0; c < commands.length; c++) {
            System.out.println(c + "번째");
            int[] temp = new int[commands[c][1] - commands[c][0] + 1];
            for (int i = commands[c][0] -1, j = 0; i < commands[c][1]; i++, j++) {
                temp[j] = array[i];
            }
            Arrays.sort(temp);
            System.out.println(Arrays.toString(temp));
            answer[c] = temp[commands[c][2] - 1];
            System.out.println(commands[c][2] + "번째 숫자: " + answer[c]);
        }
        return answer;
    }

    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}