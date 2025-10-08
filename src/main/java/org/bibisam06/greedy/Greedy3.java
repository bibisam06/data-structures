package org.bibisam06.greedy;

// < 회의 리스트 >
//회의번호	시작	종료
//A	1	4
//B	3	5
//C	0	6
//D	5	7
//E	3	8
//F	5	9
//G	6	10
//H	8	11
//I	8	12
//J	2	13
//K	12	14

/*
    그리디 3 : 최소 회의실 수 ( 활동 선택 문제 )
*/
import java.util.*;
public class Greedy3 {
public static void main(String[] args) {
    // s : 시작 시간 e : 끝나는 시간
    int[][] meetings = {{1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 8}, {5, 9}, {6, 10}, {8, 11}, {8, 12}, {2, 13}, {12, 14}};

    int rooms = minRooms(meetings);

    System.out.println(rooms);
}

public static int minRooms(int[][] meetings){
    if(meetings.length == 0) return 0;
    Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int[] meeting : meetings){
        int start = meeting[0];
        int end = meeting[1];

        if(!pq.isEmpty() && pq.peek() <= start){
        //회의실 재사용
            pq.poll();
        }

        pq.offer(end);

    }

    return pq.size();
}
}

