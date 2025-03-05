import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 1. 전체 체육복 개수 배열을 만들어서 개수 조정
        int outStudent = 0;
        int[] counts = new int[n + 1]; // index i + 1
        Arrays.fill(counts, 1);
        counts[0] = 0;

        for (int i : lost) {
            counts[i] -= 1;
        }
        for (int i : reserve) {
            counts[i] += 1;
        }
//        System.out.println(Arrays.toString(counts));

        // 2. 앞에서 뒤로 전달 1개씩 해주기? (0개 학생 있는 경우)
        for (int i = 1; i < n + 1; i++) {
            if (counts[i] == 0) {
                if (counts[i - 1] > 1) {
                    counts[i] += 1;
                    counts[i - 1] -= 1;
                } else if (i < n && counts[i + 1] > 1) {
                    counts[i] += 1;
                    counts[i + 1] -= 1;
                } else {
                    outStudent++;
                }
            }
        }
//        System.out.println(Arrays.toString(counts));

        int answer = n - outStudent;
        return answer;
    }
}