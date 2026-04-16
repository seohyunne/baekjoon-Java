import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<int[]> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] answer = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        stack.push(new int[] {arr[0], 0});

        for (int i = 1; i < n; i++) {
            // 현재 수가 오큰수라면 알맞는 위치에 오큰수 저장
            while (!stack.isEmpty() && stack.peek()[0] < arr[i]) {
                int[] num = stack.pop();
                answer[num[1]] = arr[i];
            }
            // 현재 수가 stack안 수들의 오큰수가 아니라면 담아놓기
            stack.push(new int[] {arr[i], i});
        }


		// 오큰수가 없었던 수들은 -1로 처리
        while (!stack.isEmpty()) {
            int[] num = stack.pop();
            answer[num[1]] = -1;
        }

        for (int i : answer) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
