import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        // 1. stack을 생성한다
        // 2. stack 에 arr 값을 하나씩 넣는다.
        // 2-1. 이 때, 넣으려는 arr 값이 stack에 들어있는 값과 같으면 스킵
        // 3. stack을 answer로 변환하여 리턴한다
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(stack.peek() == arr[i]) {
                continue;
            }
            stack.push(arr[i]);
        }

/**
        
        for (int i = 0; i < stack.size(); i++){
            answer[i] = stack.pop();
        }

오류) answer의 크기가 0 (빈 배열) 이 상태에서 answer[i] = stack.pop();을 수행하면 ArrayIndexOutOfBoundsException 발생. answer의 크기를 stack.size()만큼 설정해야 함...!! 또한, pop할때마다 stack 사이즈도 작아짐..
*/
        int[] answer = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--){
            answer[i] = stack.pop();
        }
        

        return answer;
    }
}