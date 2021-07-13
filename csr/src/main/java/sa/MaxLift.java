package sa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxLift {
    public static void main(String[] args) {
        int[] testcase = {4,8,5,9};

        System.out.println(new MaxLift().liftingWeights(testcase,20));
    }


    public static int liftingWeights(int[] weights, int capacity ){
        int maxLift =0 ;
        List<Integer> hlist = new ArrayList<>();

        for(int num : weights){
            hlist.add(num);
        }
        Collections.sort(hlist, Collections.reverseOrder());
        System.out.println(hlist);



        for(int i =0;i<hlist.size();i++){
            int localax =0;
            for(int j=0;j<hlist.size();j++){
                if(i==j){
                    continue;
                }else{
                    int cal=0;
                    int i1 = localax + hlist.get(j);
                    if(i1 <=capacity){
                        localax = i1;
                    }


                }
                if(localax>maxLift){
                    maxLift=localax;
                }
                }

        }
        /*for(int num : hlist){
            int localMax=0;
            while(localMax+num <= capacity){
                localMax+=num;
            }*/





        return maxLift;

    }
}
