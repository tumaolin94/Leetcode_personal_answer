class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        
        for(int num:nums){
            set.add(num);
        }
        int count=1;
        int max=1;
        for(int num:nums){
            if(set.remove(num)){
                int val = num;
                
                while(set.remove(val+1)){
                    count++;
                    val++;
                }
                val = num;
                while(set.remove(val-1)){
                    count++;
                    val--;
                }
                
                max = Math.max(count, max);
                count=1;
            }
        }
        
        return max;
    }
}
