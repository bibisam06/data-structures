package org.bibisam06.greedy;
/*
    그리디 알고리즘 1 : 동전 거스름돈 구하기
*/
import java.util.*;

public class Greedy1 {

    public static void main(String[] args){
        Integer[] coins = { 10, 50, 100, 500 };
        System.out.print("거스름돈을 입력해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int count = 0;

        //1. 정렬
        Arrays.sort(coins, Comparator.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<coins.length; i++) {
            count = money / coins[i];
            money %= coins[i];
            map.put(coins[i], count);
        }

        if(money == 0){
            System.out.println("거스름돈 끝");
        }

        for(int i=0; i<coins.length; i++){
            System.out.println(coins[i] + " " + map.get(coins[i]) + "개 입니다");
        }

    }
}
