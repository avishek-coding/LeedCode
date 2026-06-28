class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list= new ArrayList<>();

        int max=Integer.MIN_VALUE;
        for(int element : candies ){
            max=Math.max(max, element);
        }

        for(int element : candies){
            
            if((element+extraCandies)>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
    return list;

    }
}