import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] daysLeft = new int[n];
        
        // 1. 과제별로 남은 날짜 계산        
        for (int i = 0; i < n; i++) {
            daysLeft[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            // System.out.println(daysLeft[i]);
        }       
        
        
        // 2. 남은날짜 참고하여 묶음짓기 알고리즘
        // 날짜 순회..
        List<Integer> answerList = new ArrayList<>();
        // int[] answer = {}; 이걸로 하니까 크기 지정 필요해서.. ArrayList로 변경
        int daysUntilRelease = daysLeft[0]; // 배포 기준일
        int count = 1; // 배포 기능 개수

        for (int i = 1; i < n; i++){
            if(daysLeft[i] <= daysUntilRelease) {
                count ++;
            } else {
                answerList.add(count); // answerlist에 지금까지 모였던 count 추가
                daysUntilRelease = daysLeft[i];
                count = 1;
            }
        }
        answerList.add(count);
        
        
        // List<Integer> → int[] 변환 후 반환
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

// 진도 100% 일때 반영
// 배포에는 선후가 있음
// [입력] 순서: progresses. 개발속도: speeds.
// 각 배포마다 몇 개의 기능이 배포되는지?