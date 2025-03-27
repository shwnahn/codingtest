import java.util.*;

class Solution {
       public int[] solution(long[] numbers) {
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            String binNum = Long.toBinaryString(numbers[i]);
            int height = (int) Math.ceil(Math.log(binNum.length() + 1) / Math.log(2));
            int treeSize = (int) Math.pow(2, height) - 1;
            binNum = String.format("%" + treeSize + "s", binNum).replace(' ', '0');

            int answer = isValid(binNum) ? 1 : 0;
            results[i] = answer;
        }
        return results;
    }
    public boolean isValid(String binNum) {
//        System.out.println("binNum: " + binNum);
        if (binNum.length() <= 1) {
//            System.out.println("length = 1, return true");
            return true;
        }

//        2. n/2 번째 숫자가 가운데 노드
        int midIndex = (binNum.length()/2);
        char midNode = binNum.charAt(midIndex);

//        4. 가운데 노드가 0이면 하위 노드 값 확인 T/F
        if (midNode == '0') {
            // 하위노드 확인
//            System.out.println("First: " + binNum.charAt(midIndex / 2));
//            System.out.println("Second: " + binNum.charAt(midIndex + (midIndex / 2) + 1));
            if (binNum.charAt(midIndex / 2) == '1' || binNum.charAt(midIndex + (midIndex / 2) + 1) == '1') {
                // 하위노드가 1이면 false
                return false;
            }
        }

        return isValid(binNum.substring(0, midIndex)) &&
                isValid(binNum.substring(midIndex + 1));

    }
}