class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set= new HashSet<>();

        for(int num : nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            set.add(num);
        }

        for(int i=min; i<=max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}