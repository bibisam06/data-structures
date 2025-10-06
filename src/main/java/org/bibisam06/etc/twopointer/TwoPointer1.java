package org.bibisam06.etc.twopointer;
/*
    투 포인터 예제 1 : 배열이 정렬되어 있는 경우..
*/
public class TwoPointer1 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 7, 11, 15};
        int target = 9;
        int left = 0, right = arr.length - 1;

        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + sum);
                break;
            }
            else if(sum < target) { // 합이 작은 경우
                left ++;
            }else{ // 합이 큰 경우
                right --;
            }

        }

    }
}
