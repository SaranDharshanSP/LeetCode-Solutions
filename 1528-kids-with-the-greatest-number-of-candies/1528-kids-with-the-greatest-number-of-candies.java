class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies =Integer.MIN_VALUE;

        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        for(int i=0; i<candies.length; i++) {
            if(maxCandies < candies[i]) {
                maxCandies = candies[i];
            }
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }
}