import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int s:scoville){
            minHeap.add(s);
        }
        
        int mixCount = 0;
        while(minHeap.size() > 1 && minHeap.peek() < K){
            // Arrays.sort(scoville); -> 너무 시간비효율적!
            
            int notSpicy1 = minHeap.poll(); // 가장 맵지 않은 음식
            int notSpicy2 = minHeap.poll(); // 두 번째로 맵지 않은 음식
            
            int mixed_scoville = mix(notSpicy1, notSpicy2);
            minHeap.add(mixed_scoville);
            mixCount++;
        }
        
        return minHeap.peek() >= K ? mixCount : -1 ;
    }
    private int mix(int scov1, int scov2) {
        // 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        return scov1 + scov2 * 2;
    }
    
}

// 모든 음식 스코빌 K 이상일때까지 반복해서 섞기 => 최소회수 구하기
// 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

// 힙 개념 잘 모르겠다..


