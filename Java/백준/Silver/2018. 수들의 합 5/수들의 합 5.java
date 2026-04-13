import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        
        for(int i=1; i<N+1; i++){
            arr[i-1] = i;
        }

        int sum=1;
        int count=1;
        int start=1;
        int end =1;

        while(end!=N){
            if(sum<N){
                end++;
                sum+=end;
            }
            else if(sum>N){
                sum-=start;
                start++;
            }
            else{
                end++;
                sum+=end;
                count++;
            }
        }

        System.out.println(count);

    }
}
