public class Solution {
     public long solution(int w, int h) {
        int big;
        int small;
        int removeCnt;

        long answer = (long) w * h;
        // 큰 수, 작은 수 구분
        big = Math.max(w, h);
        small = Math.min(w, h);
//        System.out.println("big: " + big + " small: " + small);

        // 최대공약수 구하기
        int gcd = gcd(big, small);
//        System.out.println("gcd: " + gcd);

        // 작은 사각형 알고리즘 적용하기
        big /= gcd;
        small /= gcd;
//        System.out.println("big: " + big + " small: " + small);

        removeCnt = (big + small - 1) * gcd;
        System.out.println(removeCnt);
//        System.out.println("removeCnt: " + removeCnt);

        answer -= removeCnt;
        return answer;
    }

    private int gcd(int big, int small) {
        int remain;
        while (small != 0) {
            remain = big % small;
            big = small;
            small = remain;
        }
        return big;
    }
}