import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        // 고유한 값의 위치를 추적할 포인터 i
        int i = 0;
        
        // 배열을 순회할 포인터 j
        for (int j = 1; j < nums.length; j++) {
            // 중복되지 않는 새로운 값을 발견하면
            if (nums[j] != nums[i]) {
                i++; // 고유값 위치를 한 칸 이동하고
                nums[i] = nums[j]; // 해당 위치에 새로운 값을 복사
            }
        }
        
        // k는 고유 요소의 개수이므로 인덱스 + 1을 반환
        return i + 1;
    }
}