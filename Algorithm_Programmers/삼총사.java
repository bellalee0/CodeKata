// https://school.programmers.co.kr/learn/courses/30/lessons/131705
// 한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.

public class 삼총사 {
}

class ThreeMusketeers {
    public int solution(int[] number) {
        int answer = 0;
        for (int a = 0; a < number.length; a++) {
            for (int b = 0; b < number.length; b++) {
                if (a == b) { continue;}
                for (int c = 0; c < number.length; c++) {
                    if (a == c) { continue; }
                    else if (b == c) { continue; }
                    if ( number[a] + number[b] + number[c] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer/6;
    }

    public int solution2(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0) { answer++; }
                }
            }
        }
        return answer;
    }
}