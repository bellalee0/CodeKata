import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int teamLeader = Integer.parseInt(st2.nextToken());
        int teamMember = Integer.parseInt(st2.nextToken());

        long checker = 0;
        
        for (int i = 0; i < n; i++) {

            int remainCustomer = Integer.parseInt(st.nextToken());

            remainCustomer -= teamLeader;
            checker++;

            if (remainCustomer > 0) {

                checker += remainCustomer / teamMember;
                remainCustomer %= teamMember;
                if (remainCustomer > 0) {
                    checker++;
                }
            }
        }

        System.out.println(checker);
    }
}