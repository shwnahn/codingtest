import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        // 정렬
        Arrays.sort(phone_book);
        // for (String num: phone_book)
        //     System.out.println(num);
        
        // 한 숫자씩 찾아서 ~ 다를때까지 비교. 
        // 정렬했으니 바로 다음거만 비교하면 됨!
        for (int i = 0; i < phone_book.length - 1; i++){
            if(phone_book[i + 1].startsWith(phone_book[i])){
                return false;
            }
        }
        boolean answer = true;
        return answer;
    }
}

// 한 번호가 다른번호 접두어인지?
// 감이안오는데?
// 순회하기?
// 효율적으로 찾는법?
// 정렬하고 나서 가까운 것부터 찾기?