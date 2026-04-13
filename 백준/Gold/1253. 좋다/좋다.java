import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int count=0;

        for(int a=0; a<N; a++){
            int i=0;
            int j=N-1;
            int target = arr[a];

            while(i<j){
                int sum = arr[i]+arr[j];

                if(sum==target){
                    if(i==a){
                        i++;
                    }
                    else if(j==a){
                        j--;
                    }
                    else{
                        count++;
                        break;
                    }
                }
                else if(sum>target){
                    j--;
                }
                else{
                    i++;
                }
            }

        }
        System.out.println(count);
        br.close();
    }
}
