package edu.neu.coe.info6205.union_find;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Random;

public class HWQUPC_Solution  {


    public static int count(int n){
        int count =0;
        int p=0,q=0;

        UF_HWQUPC h = new UF_HWQUPC(n);
        Random rand = new Random();
        for(int i= 0; i<(n*(n-1))/2; i++){
            p = rand.nextInt(n);
            q = rand.nextInt(n);
            if(!h.connected(p,q)){
                h.connect(p,q);
                count++;
            }
            else
                continue;

        }




        return count;
    }
//    public static boolean areSame(int arr[])
//    {
//        // Put all array elements in a HashSet
//        Integer[] what = Arrays.stream( arr).boxed().toArray( Integer[]::new );
//        Set<Integer> s = new HashSet<>(Arrays.asList(what));
//
//
//        // If all elements are same, size of
//        // HashSet should be 1. As HashSet contains only distinct values.
//        return (s.size() == 1);
//    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        System.out.println("For "+n+" inputs");
        System.out.println("No of Connections: "+count(n));

    }
}
