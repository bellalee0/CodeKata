import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max = 0;
        int sum = 0;

        for (int i = 0; i < total; i++) {
            
            int score = Integer.parseInt(st.nextToken());

            if (max < score) {
                max = score;
            }

            sum += score;
        }

        System.out.println(sum * 100.0 / max / total);
    }
}