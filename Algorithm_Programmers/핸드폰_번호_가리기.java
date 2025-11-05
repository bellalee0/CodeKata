// https://school.programmers.co.kr/learn/courses/30/lessons/12948
// 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
// 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
// 제한 조건
// phone_number는 길이 4 이상, 20이하인 문자열입니다.

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        String phone_number = "01012345678";

        ChangePhoneNumber changePhoneNumber = new ChangePhoneNumber();
        System.out.println(changePhoneNumber.solution(phone_number));
    }
}

class ChangePhoneNumber {
    public String solution(String phone_number) {
        char[] char_number = phone_number.toCharArray();
        for (int i = 0; i < (char_number.length - 4); i++) {
            char_number[i] = '*';
        }
        return new String(char_number);
    }

    public String solution2(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
        // replace(CharSequence target, CharSequence replacement) : target 문자열을 replacement로 바꾸기 -> 특정 문자열 지정
        // replaceAll(String regex, String replacement) : 바꾸고 싶은 내용에 정규표현식 사용 가능
    }

    public String solution3(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4); // String의 substring 메서드 활용
        return answer;
    }
}