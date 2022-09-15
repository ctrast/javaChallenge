package numbers;

import sun.rmi.runtime.NewThreadAction;

import java.util.HashMap;
import java.util.Map;

public class sampleNumbers {

    public Boolean isEven(int myNum) {

        if (myNum % 2 == 0) {
            return true;
        }
        return false;
    }


    public Map<String, Integer> doesNumberAddup(int[] nums, int number) {
        Boolean addsup = false;
        //iterate over the values in nums {3,2,3,4,5}
        //for each num - check if itself and other nums add up to equal number; if so return
        Map<String, Integer> rtnMap = new HashMap<String, Integer>();
        for(int i =0; i< nums.length-1; i++){
            for (int j=0; j<= nums.length-1; j++){
                if(nums[i]+nums[j] ==number){
                    rtnMap.put("First",nums[i]);
                    rtnMap.put("Second",nums[j]);
                    rtnMap.put("Equal", 1);
                    return rtnMap;
                }
            }
        }
        return rtnMap;
    }
}
