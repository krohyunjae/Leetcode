package Tests;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Steps {

    List<List<Integer>> ans = new ArrayList<>();
    int steps = 0;
    @Test
    public void test (){
        Arrays.fill(cache, -1);
        getSteps(4);
        System.out.println(getSteps(70));
        System.out.println(steps);
    }


    private final int[] cache = new int[9999];
    public int getSteps(int n){
        if(n == 1){
            return 1;
        } else if (n == 2){
            return 2;
        }
        if(cache[n] != -1){
            return cache[n];
        }
        steps = getSteps(n-1) + getSteps(n-2);
        cache[n] = steps;
        return steps;
    }

}
