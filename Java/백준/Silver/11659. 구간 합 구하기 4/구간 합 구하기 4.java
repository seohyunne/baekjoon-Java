import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. BufferedReader와 StringTokenizer 대소문자 확인
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());

        // 합 배열을 N+1 크기로 선언 (a-1 인덱스 접근 시 에러 방지)
        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            // 2. 누적 합 계산 (1번 인덱스부터 차곡차곡)
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 3. 구간 합 출력: b까지의 합에서 a-1까지의 합을 뺌
            System.out.println(arr[b] - arr[a - 1]); 
        }
    }
}