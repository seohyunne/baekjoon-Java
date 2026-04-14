import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
    
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int arr[] = new int[N];

    for(int i=0; i<N; i++){
        arr[i] = input.nextInt();
    }

    Stack<Integer> stack = new Stack<>();
    int num = 1; // 1부터 오름차순
    boolean result = true;

    StringBuffer bf = new StringBuffer();

    for (int i=0; i<N; i++){
        int su = arr[i];

        // 1. 필요한 만큼 오름차순 push
        while (num<=su){
            stack.push(num++);
            bf.append("+\n");
        }

        // 2. 스택의 top이 현재 수열 값과 같은지 확인
        if(stack.peek()==su){
            stack.pop();
            bf.append("-\n");
        }
        else{
            // 같지 않으면 오름차순 규칙상 만들 수 없는 수열
            System.out.println("NO");
            return; // 프로그램 종료
        }
    }
        System.out.println(bf.toString());

    }
}