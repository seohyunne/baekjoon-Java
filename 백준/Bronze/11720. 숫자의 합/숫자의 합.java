import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String sNum = input.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;

        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0';
        }

        System.out.println(sum);
    }
}
