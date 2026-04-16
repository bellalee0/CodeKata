import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        String numbers = br.readLine();
        char[] numArr = numbers.toCharArray();

        int sum = 0;

        for (int i = 0; i < total; i++) {

            // sum += Character.getNumericValue(numArr[i]);
            sum += numArr[i] - '0';
        }

        System.out.println(sum);
    }
}