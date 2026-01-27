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
    
    for(int i=0; i<N; i++){
        int su = arr[i];
        if(su>=num){
            while(su>=num){
                stack.push(num++);
                bf.append("+\n");
            }
            stack.pop();
            bf.append("-\n");
        }
        else{
            int n = stack.pop();
            // 현재 수열에 있는 값이 stack의 마지막 값보다 크다 -> 절대 수열 완성이 안됨
            if(n>su){
                System.out.println("NO");
                result=false;
                break;
            }else{
                bf.append("-\n");
            }
        }
    }
    if(result==true){
        System.out.println(bf.toString());
    }

    }
}