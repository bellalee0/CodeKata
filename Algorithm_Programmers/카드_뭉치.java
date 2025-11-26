// https://school.programmers.co.kr/learn/courses/30/lessons/159994
// 문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.

public class 카드_뭉치 {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.solution(cards1, cards2, goal));
    }
}

class CardDeck {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        for (String word : goal) {
            if (idx1 < cards1.length && word.equals(cards1[idx1])) {
                idx1 ++;
            } else if (idx2 < cards2.length && word.equals(cards2[idx2])) {
                idx2 ++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}