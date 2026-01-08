import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int list[] = new int[number];
        for(int i=0; i<number; i++){
            list[i] = input.nextInt();
        }

        long sum = 0;
        long max = 0;

        for(int i =0; i<number;i++){
            if(list[i]>max){
                max = list[i];
            }
            sum +=list[i];
        }

        System.out.println(sum*100.0/max/number);

    }
}
