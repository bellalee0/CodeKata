// https://school.programmers.co.kr/learn/courses/30/lessons/161989
// 정수 n, m과 다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section이 매개변수로 주어질 때 롤러로 페인트칠해야 하는 최소 횟수를 return 하는 solution 함수를 작성해 주세요.
// 제한사항
// 1 ≤ m ≤ n ≤ 100,000
// 1 ≤ section의 길이 ≤ n
// 1 ≤ section의 원소 ≤ n
// section의 원소는 페인트를 다시 칠해야 하는 구역의 번호입니다.
// section에서 같은 원소가 두 번 이상 나타나지 않습니다.
// section의 원소는 오름차순으로 정렬되어 있습니다.

public class 덧칠하기 {
    public static void main(String[] args) {
        PaintOver paintOver = new PaintOver();
        System.out.println(paintOver.solution(8, 4,	new int[]{2, 3, 6}));
    }

}

class PaintOver {
    public int solution(int n, int m, int[] section) {
        boolean[] paint = new boolean[n];

        for (int i = 0; i < section.length; i++) {
            paint[section[i]-1] = true;
        }

        int count = 0;
        for (int i = 0; i < paint.length; i++) {
            if (paint[i]) {
                if (i+m >= paint.length) {
                    for (int j = paint.length - m + 1; j < paint.length; j++) {
                        paint[j] = false;
                    }
                } else {
                    for (int j = i; j < i + m; j++) {
                        paint[j] = false;
                    }
                }
                count++;
            }
        }

        return count;
    }

    public int solution2(int n, int m, int[] section) {
        int roller = section[0];
        int cnt = 1;
        for(int i = 1; i < section.length; i++) {
            if(roller + m - 1 < section[i]) {
                cnt++;
                roller = section[i];
            }
        }
        return cnt;
    }
}