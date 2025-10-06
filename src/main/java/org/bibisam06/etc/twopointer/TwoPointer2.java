package org.bibisam06.etc.twopointer;

/*
    투 포인터 예제 2 : 정렬 안되어 있는 경우, 중복 값이 존재하는 경우..
*/

import java.util.*;

public class TwoPointer2 {

    public static void main(String[] args){
    //int[] arr = {1, 2, 3, 5, 7, 11, 15};
        int[] arr = { 2, 1, 13, 7, 9, 8, 19, 7 };
        int target = 20;
        int left = 0, right = arr.length - 1;

        Arrays.sort(arr); //정렬 안되어 있는 배열 -> 정렬 먼저 해주기

        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                System.out.println(arr[left] + " + " + arr[right]);

                while(arr[left] == arr[left + 1]) left ++;
                while(arr[right] == arr[right - 1]) right --;
                left ++;
                right --;
            }else if(sum < target) {
                left ++;
            }else {
                right --;
            }
        }


    }
}
