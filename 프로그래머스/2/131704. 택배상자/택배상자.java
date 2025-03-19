import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> belt = new Stack<Integer>();
        int cnt = 0;

        for (int i = 1; i <= order.length; i++) {
            // (1) to Belt
            belt.push(i);


            // (2) Belt to Truck 루프
            while (true) {
                if (belt.isEmpty()) {
                    break;
                }
                else if (belt.peek() == order[cnt]) {
                    belt.pop();
                    cnt++;
                } else {
                    break;
                }
            }
        }

        return cnt;
    }
}