import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int startPointer = 1;
        int endPointer = 1;
        int sum =1;
        int answer =0;

        while(endPointer<=n){
            if(sum == n){
                answer++;
                endPointer++;
                sum+=endPointer;
            } else if(sum>n){
                sum -=startPointer;
                startPointer++;
            } else{ //sum<n일 경우
                endPointer++;
                sum+=endPointer;
            }
        }
        System.out.println(answer);
    }
}