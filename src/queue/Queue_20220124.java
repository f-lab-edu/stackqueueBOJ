package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_20220124 {

    public static void main(String[] args) throws Exception {

        Queue<Integer> q = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pushN = 0;
        while( n-- > 0 ) {
            String str = sc.next();

            switch(str) {
                case "push":
                    pushN = sc.nextInt();
                    q.add(pushN);
                    break;
                case "front":
                    System.out.println( q.isEmpty()?-1:q.peek() );
                    break;
                case "back":
                    System.out.println( q.isEmpty()?-1:pushN);
                    break;
                case "empty":
                    System.out.println( q.isEmpty()?1:0);
                    break;
                case "pop":
                    System.out.println( q.isEmpty()?-1:q.poll());
                    break;
                case "size":
                    System.out.println( q.size());
                    break;

            }
        }
    }
}
