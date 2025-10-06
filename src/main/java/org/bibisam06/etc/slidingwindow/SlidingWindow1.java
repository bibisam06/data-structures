package org.bibisam06.etc.slidingwindow;

/*
    슬라이딩 윈도우 예시 1 : 연속 k 개의 정수들의 최대합 구하기
*/
public class SlidingWindow1 {
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int windowSum = 0, maxSum = 0;

        //처음 k개
        for(int i=0; i<k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for(int i=k; i<arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(windowSum, maxSum);

        }

        System.out.println("max : " + maxSum);
    }
}
