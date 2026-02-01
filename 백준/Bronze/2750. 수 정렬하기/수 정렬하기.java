import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = input.nextInt();
        }

        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                int temp = 0;
                if(arr[j]>=arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
