package org.bibisam06.etc.Permutation.PerMutation1;

import java.util.Arrays;

public class PerMutation1 {
    static int[] arr = {1, 2, 3, 4};
    static boolean[] visited = new boolean[arr.length];
    static int[] output = new int[2];
    public static void main(String[] args) {

        permutation(0, 2);
    }

    static void permutation(int depth, int r){
        if(depth == r){
            System.out.println(Arrays.toString(output));
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(visited[i]) continue;
            visited[i] = true;

            output[depth] = arr[i];
            permutation(depth+1, r);
            visited[i] = false;
        }
    }

}
