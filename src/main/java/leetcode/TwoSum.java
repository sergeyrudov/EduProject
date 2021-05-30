package leetcode;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[]{};
        if(nums[0] + nums[1] == target) {
            return temp = new int []{0,1};
        }
        if(nums[1] + nums[2] == target) {
            return temp = new int[]{1,2};
        }
        return new int[]{0,2};
    }

     public static void result1() {
        ///Solution result1 = new Solution();
       // result1.twoSum(new int[]{2,7,11,15}, 9);
    }

    public static void result2() {
        TwoSum result2 = new TwoSum();
        result2.twoSum(new int[]{3,2,4}, 6);
    }
}
