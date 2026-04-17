import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        
        int n = input.nextInt();

        for(int i=1; i<n+1; i++){
            queue.add(i);
        }

        while(queue.size()>1){
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());

    }
}
