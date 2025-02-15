class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // 여는 괄호 개수 카운팅
        // 닫는 괄호 개수만큼 여는괄호에서 빼기
        // 닫는 괄호로 시작하거나, 닫는 괄호가 더 많으면 false
        
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '('){
                opened++;
            } else if (c ==')') opened --;
            // System.out.println(opened);
            if (opened < 0) return false;
        }
        if (opened != 0) return false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}