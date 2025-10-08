package org.bibisam06.greedy;
/*
    Greedy2 : 회의실 배정( 겹치지 않게 최대한 많이 회의실 선택하기 )
*/
import java.util.*;
public class Greedy2 {
public static void main(String[] args){
    // s : 시작 시간 e : 끝나는 시간
    int[][] meetings = {{1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 8}, {5, 9}, {6, 10}, {8, 11}, {8, 12}, {2, 13}, {12, 14}};

    System.out.println(maxRooms(meetings));
}

static int maxRooms(int[][] meetings){
    Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
    List<int[]> chosen = new ArrayList<>();
    int curEnd = Integer.MIN_VALUE;
    for(int[] meeting : meetings){
        int start = meeting[0];
        int end = meeting[1];

        if(start >= curEnd){
            curEnd = end;
            chosen.add(meeting);
        }
    }
    return chosen.size();
}
}
