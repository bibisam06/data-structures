package org.bibisam06.bruteforce;

import java.util.ArrayList;
import java.util.List;

//부분집합
public class Subset {
    static int[] arr = {1, 2, 3, 4, 5, 6};
    public static void main(String[] args)
    {
        List<Integer> current = new ArrayList<Integer>();
        bfs(current, 0);

    }

    public static void bfs(List<Integer> current, int index){
        if(index == arr.length){ // * 모든 원소를 전부 선택한 경우
            System.out.println(current);
            return;
        }

        //1. 현재원소를 선택하는 경우
        current.add(arr[index]);
        bfs(current, index+1);

        //BackTracking : 되돌리기
        current.remove(current.size()-1);
        //2. 현재원소를 선택하지 않는 경우
        bfs(current,index+1);
    }
}
