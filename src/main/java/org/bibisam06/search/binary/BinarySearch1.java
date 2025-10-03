package org.bibisam06.search.binary;
/*
    이진트리 1 : 재귀를 통한 구현
*/
public class BinarySearch1 {

   public static void main(String[] args) {
      int[] arr = {1,3,5,7,9,11,13}; // 정렬 필수!
      int right = arr.length-1;
      System.out.println(binarySearch(arr, 7, 0, right));  // 3
      System.out.println(binarySearch(arr, 4, 0, right));  // -1
   }

   static int binarySearch(int[] arr, int n, int left, int right){ // 처음, 끝 인덱스 넣어줘야함

      if(left > right) {
         return -1;
      }


      int mid = (left + right) / 2;
      if (arr[mid] == n) return mid;
      else if (arr[mid] < n)
         return binarySearch(arr, n, mid +1, right);
      else
         return binarySearch(arr, n, left, mid - 1);
      
   }
}
