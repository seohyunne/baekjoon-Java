import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        // 큐 생성
        for(int i=0;i<N;i++){
            queue.add(i+1);
        }

        while(queue.size()>1){
            // 최상단 수 제거
            queue.remove();
            int top = queue.poll();
            queue.add(top);
        }

        System.out.println(queue.peek());
    }
}
