import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 1. Unique 한 종류 개수 카운트
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        
        // 2. N/2 값과 비교
        // 3. 둘 중 더 작은 값 리턴
        
        int pickCount = nums.length / 2;
        // System.out.println(pickCount);
        // System.out.println(set.size());
        if (set.size() > pickCount) {
            answer = pickCount;
        } else {
            answer = set.size();
        }
        
        return answer;
    }
}

// N/2 마리 가져가기 4C2
// 최대한 많은 종류로 가져가기
// 가장 많은 종류를 선택하는 방법 -> 그 때의 포켓몬 종류 수 리턴

// 1. Unique 한 종류 개수 카운트
// 2. N/2 값과 비교
// 3. 둘 중 더 작은 값 리턴