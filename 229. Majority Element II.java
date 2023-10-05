class Solution {
    public List<Integer> majorityElement(int[] nums) {
        var ans=new HashSet<Integer>();
        var map=new HashMap<Integer,Integer>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);

            if(map.get(n)>nums.length/3)
                ans.add(n);
        }
        return new ArrayList<>(ans);
    }
}
